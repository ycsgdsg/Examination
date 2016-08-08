package com.chaoyuan.executor.compiler.impl;

import com.chaoyuan.executor.utils.Constants;
import com.chaoyuan.executor.utils.JavaStringObject;

import javax.tools.*;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chaoyuan on 08/08/2016.
 */
public class JavaCompiler implements com.chaoyuan.executor.compiler.Compiler {

    private String classname;
    private String content;

    public JavaCompiler(String classname, String content) {
        this.classname = classname;
        this.content = content;
    }

    @Override
    public void compile() throws Exception {
        javax.tools.JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticCollector<JavaFileObject> diagnosticsCollector = new DiagnosticCollector<JavaFileObject>();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnosticsCollector, null, null);
        JavaStringObject sourceObject = new JavaStringObject(classname, content);
        Iterable<? extends JavaFileObject> fileObjects = Arrays.asList(sourceObject);
        String path = Constants.outputFolder;
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        Iterable<String> options = Arrays.asList("-d", path);
        javax.tools.JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, diagnosticsCollector, options, null, fileObjects);
        try {
            Boolean success = task.call();
            if (!success) {
                StringBuffer sb = new StringBuffer();
                List<Diagnostic<? extends JavaFileObject>> diagnostics = diagnosticsCollector.getDiagnostics();
                for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics) {
                    sb.append(diagnostic.toString()).append("\n");
                }
                throw new Exception(sb.toString());
            }
        } finally {
            fileManager.close();
        }
    }
}

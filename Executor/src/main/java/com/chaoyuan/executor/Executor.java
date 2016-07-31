package com.chaoyuan.executor;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yc on 2016/7/24.
 */
public abstract class Executor {

    private String classname;
    private String content;

    public Executor(String classname, String content) throws Exception {
        this.classname = classname;
        this.content = content;
        compile();
    }

    public String getClassname() {
        return classname;
    }

    public String getContent() {
        return content;
    }

    private void compile() throws Exception {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        JavaStringObject sourceObject = new JavaStringObject(classname, content);
        Iterable<? extends JavaFileObject> fileObjects = Arrays.asList(sourceObject);
        String path = Class.class.getClass().getResource("/").getPath();
        Iterable< String> options = Arrays.asList("-d", path);
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, options, null, fileObjects);
        task.call();
    }

    public Object invoke(Object[] args) throws Exception {
        Class cl = Class.forName(getClassname());
        Constructor con = cl.getConstructor();
        Object o = con.newInstance();
        Method m = getMethod();
        Object result = m.invoke(o, args);
        return result;
    }

    public abstract Method getMethod() throws Exception;
}

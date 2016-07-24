package com.chaoyuan.executor;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;

/**
 * Created by yc on 2016/7/24.
 */
public class ClassUtil {

    public final String fileFolder = "";

    public void compile(String filePath) throws Exception {
        File file = new File(filePath);
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
    }
}

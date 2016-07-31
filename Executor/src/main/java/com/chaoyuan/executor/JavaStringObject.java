package com.chaoyuan.executor;

import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by ycsgd on 2016/7/31.
 */
public class JavaStringObject extends SimpleJavaFileObject {

    private String content = null;

    public JavaStringObject(String name, String content) throws URISyntaxException {
        super(URI.create("string:///" + name.replace('.', '/') + JavaFileObject.Kind.SOURCE.extension),
                JavaFileObject.Kind.SOURCE);
        this.content = content;
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
        return content;
    }
}

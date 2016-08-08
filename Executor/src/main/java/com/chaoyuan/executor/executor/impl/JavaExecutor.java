package com.chaoyuan.executor.executor.impl;

import com.chaoyuan.executor.executor.Executor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by chaoyuan on 08/08/2016.
 */
public abstract class JavaExecutor implements Executor {
    private Class realizedClass;

    public JavaExecutor(String classname) throws Exception {
        realizedClass = Class.forName(classname);
    }

    public Class getRealizedClass() {
        return this.realizedClass;
    }

    public Object execute(Object[] args) throws Exception {
        Constructor con = realizedClass.getConstructor();
        Object o = con.newInstance();
        Method m = getRealizedMethod();
        Object result = m.invoke(o, args);
        return result;
    }
}

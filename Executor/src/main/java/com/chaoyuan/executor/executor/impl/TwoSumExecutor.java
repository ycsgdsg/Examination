package com.chaoyuan.executor.executor.impl;

import java.lang.reflect.Method;

/**
 * Created by ycsgd on 2016/7/31.
 */
public class TwoSumExecutor extends JavaExecutor {

    public TwoSumExecutor(String classname) throws Exception {
        super(classname);
    }

    @Override
    public Method getRealizedMethod() throws Exception {
        Method method = getRealizedClass().getMethod("twoSum", int[].class, int.class);
        return method;
    }
}

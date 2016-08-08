package com.chaoyuan.executor.executor;

import java.lang.reflect.Method;

/**
 * Created by yc on 2016/7/24.
 */
public interface Executor {
    public Object execute(Object[] args) throws Exception;
    public Method getRealizedMethod() throws Exception;
}

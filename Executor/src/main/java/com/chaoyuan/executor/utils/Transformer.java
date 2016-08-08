package com.chaoyuan.executor.utils;

/**
 * Created by chaoyuan on 08/08/2016.
 */
public class Transformer {
    public static String arrayToString(int []array) {
        if (array == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        for (int i : array) {
            sb.append(i).append(",");
        }
        return sb.toString();
    }
}

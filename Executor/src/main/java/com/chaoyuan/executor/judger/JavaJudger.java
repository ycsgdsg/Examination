package com.chaoyuan.executor.judger;


import java.util.Arrays;

/**
 * Created by chaoyuan on 08/08/2016.
 */
public class JavaJudger {

    public static boolean verify(int[] o1, int[] o2) {
        if (o1 == o2) {
            return true;
        }
        if (o1 == null || o2 == null) {
            return false;
        }
        if (o1.length != o2.length) {
            return false;
        }
        Arrays.sort(o1);
        Arrays.sort(o2);
        return Arrays.equals(o1, o2);
    }
}

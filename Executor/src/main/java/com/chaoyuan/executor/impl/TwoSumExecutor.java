package com.chaoyuan.executor.impl;

import com.chaoyuan.executor.Executor;

import java.lang.reflect.Method;

/**
 * Created by ycsgd on 2016/7/31.
 */
public class TwoSumExecutor extends Executor {

    public TwoSumExecutor(String classname, String content) throws Exception {
        super(classname, content);
    }

    @Override
    public Method getMethod() throws Exception {
        Class cla = Class.forName(getClassname());
        Method method = cla.getMethod("twoSum", int[].class, int.class);
        return method;
    }

    public static void main(String[] args) throws Exception {
        String source =
                        "package com.chaoyuan.solution;\n" +
                        "import java.util.ArrayList;\n" +
                        "import java.util.HashMap;\n" +
                        "import java.util.List;\n" +
                        "import java.util.Map;\n" +
                        "\n" +
                        "/**\n" +
                        " * Created by yc on 2015/11/7.\n" +
                        " */\n" +
                        "public class TwoSum {\n" +
                        "    public int[] twoSum(int[] nums, int target) {\n" +
                        "        int[] result = new int[2];\n" +
                        "        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();\n" +
                        "        for (int index = 0; index < nums.length; index++) {\n" +
                        "            if (map.containsKey(nums[index])) {\n" +
                        "                map.get(nums[index]).add(index + 1);\n" +
                        "            } else {\n" +
                        "                List<Integer> list = new ArrayList<Integer>();\n" +
                        "                list.add(index + 1);\n" +
                        "                map.put(nums[index], list);\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "        for (int num : nums) {\n" +
                        "            int sub = target - num;\n" +
                        "            if (map.containsKey(sub)) {\n" +
                        "                List<Integer> list1 = map.get(num);\n" +
                        "                List<Integer> list2 = map.get(sub);\n" +
                        "                if (sub == num) {\n" +
                        "                    if (list1.size() > 1) {\n" +
                        "                        result[0] = list1.get(0);\n" +
                        "                        result[1] = list1.get(list1.size() - 1);\n" +
                        "                    } else {\n" +
                        "                        continue;\n" +
                        "                    }\n" +
                        "                } else {\n" +
                        "                    result[0] = list1.get(0);\n" +
                        "                    result[1] = list2.get(list2.size() - 1);\n" +
                        "                }\n" +
                        "                break;\n" +
                        "            }\n" +
                        "        }\n" +
                        "        return result;\n" +
                        "    }\n" +
                        "\n" +
                        "    public static void main(String[] args) {\n" +
                        "        TwoSum ts = new TwoSum();\n" +
                        "        ts.print(ts.twoSum(new int[]{2,3,2,3,3,4,4}, 6));\n" +
                        "    }\n" +
                        "\n" +
                        "    public void print(int[] numbers) {\n" +
                        "        if (numbers != null) {\n" +
                        "            for (int number : numbers) {\n" +
                        "                System.out.println(number);\n" +
                        "            }\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n";
        String classname = "com.chaoyuan.solution.TwoSum";
        TwoSumExecutor cu = new TwoSumExecutor(classname, source);
        try {
            Object result = cu.invoke(new Object[]{new int[]{1,2,3,4,5}, 6});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

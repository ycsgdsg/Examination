package com.chaoyuan.executor.cases;

import com.chaoyuan.executor.judger.cases.JudgeTwoSum;
import org.testng.annotations.Test;

/**
 * Created by chaoyuan on 08/08/2016.
 */
public class TestTwoSumJudger {

    @Test
    public void testForNull() throws Exception {
        String classname = "com.beyondsoft.solution.abc.TwoSum";
        String packageName = classname.substring(0, classname.lastIndexOf("."));
        String content =
                "package " + packageName + ";\n" +
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
        JudgeTwoSum tts = new JudgeTwoSum(classname, content);
        tts.testForNull();
    }
}

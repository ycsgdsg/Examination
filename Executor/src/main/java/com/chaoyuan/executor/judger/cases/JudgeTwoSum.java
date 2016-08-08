package com.chaoyuan.executor.judger.cases;

import com.chaoyuan.executor.compiler.impl.JavaCompiler;
import com.chaoyuan.executor.compiler.Compiler;
import com.chaoyuan.executor.executor.Executor;
import com.chaoyuan.executor.executor.impl.TwoSumExecutor;
import com.chaoyuan.executor.judger.JavaJudger;
import com.chaoyuan.executor.utils.Transformer;

/**
 * Created by ycsgd on 2016/7/31.
 */
public class JudgeTwoSum {

        private String classname;
        private String content;
        private Compiler compiler;
        private Executor executor;

        public JudgeTwoSum(String classname, String content) throws Exception {
                this.classname = classname;
                this.content = content;
                compiler = new JavaCompiler(this.classname, this.content);
                compiler.compile();
                executor = new TwoSumExecutor(this.classname);
        }

        public void testForRegular() throws Exception {
                int[] nums = new int[] {1, 2, 3, 4, 5};
                int target = 6;
                int[] expect = new int[] {1, 1};
                int[] actual = (int [])executor.execute(new Object[]{nums, target});
                if (!JavaJudger.verify(expect, actual)) {
                        throw new Exception("\nExpect:\t" + Transformer.arrayToString(expect) + "\n" +
                                                "Actual:\t" + Transformer.arrayToString(actual) + "\n");
                }
        }

        public void testForNull() throws Exception {
                int[] nums = new int[]{};
                int target = 5;
                int[] expect = null;
                int[] actual = (int [])executor.execute(new Object[]{nums, target});
                if (!JavaJudger.verify(expect, actual)) {
                        throw new Exception("\nExpect:\t" + Transformer.arrayToString(expect) + "\n" +
                                "Actual:\t" + Transformer.arrayToString(actual) + "\n");
                }
        }
}

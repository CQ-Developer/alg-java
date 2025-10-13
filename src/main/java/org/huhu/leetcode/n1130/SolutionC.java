package org.huhu.leetcode.n1130;

/**
 * 单调栈(数组)
 */
class SolutionC implements Solution {

    @Override
    public int mctFromLeafValues(int[] arr) {
        int i = -1, sum = 0;
        int[] stack = new int[arr.length];
        for (int x : arr) {
            while (i > -1 && x >= stack[i]) {
                int y = stack[i--];
                if (i == -1 || stack[i] > x) {
                    sum += y * x;
                } else {
                    sum += y * stack[i];
                }
            }
            stack[++i] = x;
        }
        while (i > 0) {
            int x = stack[i--];
            sum += stack[i] * x;
        }
        return sum;
    }

}

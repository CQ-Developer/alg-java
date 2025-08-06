package org.huhu.leetcode.n2815;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int maxSum(int[] nums) {
        int res = -1;
        int[] table = new int[10];
        Arrays.fill(table, Integer.MIN_VALUE);
        for (int num : nums) {
            int i = 0;
            for (int x = num; x > 0; x /= 10) {
                i = Math.max(i, x % 10);
            }
            res = Math.max(res, num + table[i]);
            table[i] = Math.max(table[i], num);
        }
        return res;
    }

}

package org.huhu.leetcode.n2441;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int findMaxK(int[] nums) {
        int res = -1;
        int[] caching = new int[2001];
        Arrays.fill(caching, Integer.MIN_VALUE);
        for (int num : nums) {
            if (caching[1000 - num] == -num) {
                res = Math.max(res, Math.abs(num));
            }
            caching[num + 1000] = num;
        }
        return res;
    }

}

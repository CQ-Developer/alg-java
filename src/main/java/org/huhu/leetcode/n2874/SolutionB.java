package org.huhu.leetcode.n2874;

/**
 * 动态规划
 */
class SolutionB implements Solution {

    @Override
    public long maximumTripleValue(int[] nums) {
        long res = 0, pre = 0, dif = 0;
        for (int x : nums) {
            res = Math.max(res, dif * x);
            dif = Math.max(dif, pre - x);
            pre = Math.max(pre, x);
        }
        return res;
    }

}

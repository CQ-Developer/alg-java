package org.huhu.leetcode.n53;

class SolutionC implements Solution {

    @Override
    public int maxSubArray(int[] nums) {
        int mx = Integer.MIN_VALUE, dp = 0;
        for (int x : nums) {
            dp = Math.max(dp, 0) + x;
            mx = Math.max(mx, dp);
        }
        return mx;
    }

}

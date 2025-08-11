package org.huhu.leetcode.n3584;

class SolutionA implements Solution {

    @Override
    public long maximumProduct(int[] nums, int m) {
        long res = Long.MIN_VALUE;
        long mn = Long.MAX_VALUE, mx = Long.MIN_VALUE;
        for (int i = m - 1; i < nums.length; i++) {
            mn = Math.min(mn, nums[i - m + 1]);
            mx = Math.max(mx, nums[i - m + 1]);
            res = Math.max(res, Math.max(mn * nums[i], mx * nums[i]));
        }
        return res;
    }

}

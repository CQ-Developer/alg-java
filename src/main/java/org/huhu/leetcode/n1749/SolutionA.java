package org.huhu.leetcode.n1749;

class SolutionA implements Solution {

    @Override
    public int maxAbsoluteSum(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int[] mx = new int[n + 1], mn = new int[n + 1];
        for (int i = 0; i < n; i++) {
            mx[i + 1] = Math.max(mx[i], 0) + nums[i];
            mn[i + 1] = Math.min(mn[i], 0) + nums[i];
            ans = Math.max(ans, Math.max(mx[i + 1], -mn[i + 1]));
        }
        return ans;
    }

}

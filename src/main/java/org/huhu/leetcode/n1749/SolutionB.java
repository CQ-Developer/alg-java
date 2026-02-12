package org.huhu.leetcode.n1749;

class SolutionB implements Solution {

    @Override
    public int maxAbsoluteSum(int[] nums) {
        int ans = 0, mx = 0, mn = 0;
        for (int x : nums) {
            mx = Math.max(mx, 0) + x;
            mn = Math.min(mn, 0) + x;
            ans = Math.max(ans, Math.max(mx, -mn));
        }
        return ans;
    }

}

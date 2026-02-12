package org.huhu.leetcode.n1749;

class SolutionC implements Solution {

    @Override
    public int maxAbsoluteSum(int[] nums) {
        int sum = 0, mx = 0, mn = 0;
        for (int x : nums) {
            sum += x;
            mx = Math.max(mx, sum);
            mn = Math.min(mn, sum);
        }
        return mx - mn;
    }

}

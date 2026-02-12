package org.huhu.leetcode.n53;

class SolutionA implements Solution {

    @Override
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, pre = 0, preMin = 0;
        for (int x : nums) {
            pre += x;
            max = Math.max(max, pre - preMin);
            preMin = Math.min(preMin, pre);
        }
        return max;
    }

}

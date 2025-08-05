package org.huhu.leetcode.n2016;

class SolutionA implements Solution {

    @Override
    public int maximumDifference(int[] nums) {
        int min = nums[0], res = 0;
        for (int x : nums) {
            if (x < min) {
                min = x;
            } else {
                res = Math.max(res, x - min);
            }
        }
        return res == 0 ? -1 : res;
    }

}

package org.huhu.leetcode.n2439;

class SolutionB implements Solution {

    @Override
    public int minimizeArrayValue(int[] nums) {
        long res = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            res = Math.max(res, (sum + i) / (i + 1));
        }
        return (int) res;
    }

}

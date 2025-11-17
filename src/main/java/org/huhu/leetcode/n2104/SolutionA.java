package org.huhu.leetcode.n2104;

class SolutionA implements Solution {

    @Override
    public long subArrayRanges(int[] nums) {
        long sum = 0;
        int n = nums.length;
        for (int r = 0; r < n; r++) {
            int min = nums[r], max = nums[r];
            for (int l = r; l >= 0; l--) {
                min = Math.min(min, nums[l]);
                max = Math.max(max, nums[l]);
                sum += max - min;
            }
        }
        return sum;
    }

}

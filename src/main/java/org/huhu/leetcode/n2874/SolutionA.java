package org.huhu.leetcode.n2874;

class SolutionA implements Solution {

    @Override
    public long maximumTripleValue(int[] nums) {
        int n = nums.length;
        int[] rMax = new int[n + 1];
        for (int i = n - 1; i > 1; i--) {
            rMax[i] = Math.max(rMax[i + 1], nums[i]);
        }
        long lMax = nums[0], result = 0;
        for (int j = 1; j < n - 1; j++) {
            result = Math.max(result, (lMax - nums[j]) * rMax[j + 1]);
            lMax = Math.max(lMax, nums[j]);
        }
        return result;
    }

}

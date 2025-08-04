package org.huhu.leetcode.n2441;

import java.util.Arrays;

class SolutionC implements Solution {

    @Override
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0, j = n - 1; i < j && nums[i] < 0 && nums[j] > 0; ) {
            if (-nums[i] < nums[j]) {
                j--;
            } else if (-nums[i] > nums[j]) {
                i++;
            } else {
                return nums[j];
            }
        }
        return -1;
    }

}

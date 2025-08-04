package org.huhu.leetcode.n2441;

import java.util.Arrays;

class SolutionB implements Solution {

    @Override
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int res = -1, n = nums.length;
        for (int i = 0; i < n && nums[i] < 0 && res == -1; i++) {
            if (Arrays.binarySearch(nums, i + 1, n, -nums[i]) >= 0) {
                res = -nums[i];
            }
        }
        return res;
    }

}

package org.huhu.leetcode.n2760;

class SolutionA implements Solution {

    @Override
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int longest = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= threshold && (nums[i] & 1) == 0) {
                int j = i;
                while (i + 1 < n && nums[i + 1] <= threshold && (nums[i] & 1) != (nums[i + 1] & 1)) {
                    i++;
                }
                longest = Math.max(longest, i - j + 1);
            }
        }
        return longest;
    }

}

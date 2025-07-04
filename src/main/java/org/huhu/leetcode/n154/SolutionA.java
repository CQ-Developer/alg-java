package org.huhu.leetcode.n154;

class SolutionA implements Solution {

    @Override
    public int findMin(int[] nums) {
        int l = -1, r = nums.length - 1;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (nums[i] < nums[r]) {
                r = i;
            } else if (nums[i] > nums[r]) {
                l = i;
            } else {
                r--;
            }
        }
        return nums[r];
    }

}

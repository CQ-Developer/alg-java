package org.huhu.leetcode.n81;

class SolutionA implements Solution {

    @Override
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int i = l + (r - l) / 2;
            if (nums[i] == target) {
                return true;
            }
            if (nums[l] < nums[i]) {
                if (nums[i] > target && nums[l] <= target) {
                    r = i - 1;
                } else {
                    l = i + 1;
                }
            } else if (nums[l] > nums[i]) {
                if (nums[i] < target && nums[r] >= target) {
                    l = i + 1;
                } else {
                    r = i - 1;
                }
            } else {
                l++;
            }
        }
        return false;
    }

}

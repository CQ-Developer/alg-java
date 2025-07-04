package org.huhu.leetcode.n33;

class SolutionA implements Solution {

    @Override
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = -1, r = n;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (nums[i] > target) {
                if (target < nums[0] && nums[i] > nums[n - 1]) {
                    l = i;
                } else {
                    r = i;
                }
            } else if (nums[i] < target) {
                if (target > nums[n - 1] && nums[i] < nums[0]) {
                    r = i;
                } else {
                    l = i;
                }
            } else {
                return i;
            }
        }
        return -1;
    }

}

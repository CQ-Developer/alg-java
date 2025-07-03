package org.huhu.leetcode.n153;

class SolutionA implements Solution {

    @Override
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = -1, r = n - 1;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (nums[i] < nums[n - 1]) {
                r = i;
            } else {
                l = i;
            }
        }
        return nums[r];
    }

}

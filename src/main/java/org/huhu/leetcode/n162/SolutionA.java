package org.huhu.leetcode.n162;

class SolutionA implements Solution {

    @Override
    public int findPeakElement(int[] nums) {
        int l = -1, r = nums.length - 1;
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return r;
    }

}

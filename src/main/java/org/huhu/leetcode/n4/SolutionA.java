package org.huhu.leetcode.n4;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] nums = new int[m + n];
        System.arraycopy(nums1, 0, nums, 0, m);
        System.arraycopy(nums2, 0, nums, m, n);
        Arrays.sort(nums);
        int i = (m + n) / 2;
        if ((m + n) % 2 == 0) {
            return (nums[i] + nums[i - 1]) / 2.0;
        }
        return nums[i];
    }

}

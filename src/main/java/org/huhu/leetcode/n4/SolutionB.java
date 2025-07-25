package org.huhu.leetcode.n4;

class SolutionB implements Solution {

    @Override
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k = 0, i = 0, j = 0, m = nums1.length, n = nums2.length;
        int[] nums = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }
        while (i < m) {
            nums[k++] = nums1[i++];
        }
        while (j < n) {
            nums[k++] = nums2[j++];
        }
        int p = (m + n) / 2;
        return (m + n) % 2 == 0 ? (nums[p - 1] + nums[p]) / 2.0 : nums[p];
    }

}

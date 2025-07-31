package org.huhu.leetcode.n4;

class SolutionC implements Solution {

    @Override
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] t = nums1;
            nums1 = nums2;
            nums2 = t;
        }
        int m = nums1.length, n = nums2.length;
        int l = -1, r = m;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            int j = (m + n + 1) / 2 - i - 2;
            if (nums1[i] <= nums2[j + 1]) {
                l = i;
            } else {
                r = i;
            }
        }
        int i = l;
        int j = (m + n + 1) / 2 - i - 2;
        int ai = i >= 0 ? nums1[i] : Integer.MIN_VALUE;
        int bj = j >= 0 ? nums2[j] : Integer.MIN_VALUE;
        int ai1 = i + 1 < m ? nums1[i + 1] : Integer.MAX_VALUE;
        int bj1 = j + 1 < n ? nums2[j + 1] : Integer.MAX_VALUE;
        int max1 = Math.max(ai, bj);
        int min2 = Math.min(ai1, bj1);
        return (m + n) % 2 > 0 ? max1 : (max1 + min2) * 0.5;
    }

}

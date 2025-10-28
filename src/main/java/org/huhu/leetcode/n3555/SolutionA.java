package org.huhu.leetcode.n3555;

class SolutionA implements Solution {

    @Override
    public int[] minSubarraySort(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            int l = -1, r = -1;
            int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE;
            for (int p = i; p < i + k; p++) {
                if (nums[p] < mx) {
                    r = p;
                } else {
                    mx = nums[p];
                }
                int q = i + k - 1 - p + i;
                if (nums[q] > mn) {
                    l = q;
                } else {
                    mn = nums[q];
                }
            }
            if (r > -1) {
                ans[i] = r - l + 1;
            }
        }
        return ans;
    }

}

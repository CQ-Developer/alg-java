package org.huhu.leetcode.n962;

class SolutionA implements Solution {

    @Override
    public int maxWidthRamp(int[] nums) {
        int n = nums.length, k = 0;
        int[] stk = new int[n];
        for (int i = 0; i < n; i++) {
            if (k == 0 || nums[i] < nums[stk[k - 1]]) {
                stk[k++] = i;
            }
        }
        int mx = 0;
        for (int j = n - 1; j > -1; j--) {
            while (k > 0 && nums[j] >= nums[stk[k - 1]]) {
                mx = Math.max(mx, j - stk[--k]);
            }
        }
        return mx;
    }

}

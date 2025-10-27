package org.huhu.leetcode.n2832;

class SolutionA implements Solution {

    @Override
    public int[] maximumLengthOfRanges(int[] nums) {
        int n = nums.length;

        int k = 0;
        int[] stk = new int[n];

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            while (k > 0 && nums[i] > nums[stk[k - 1]]) {
                k--;
            }
            ans[i] = k == 0 ? -1 : stk[k - 1];
            stk[k++] = i;
        }

        k = 0;
        for (int i = n - 1; i > -1; i--) {
            while (k > 0 && nums[i] > nums[stk[k - 1]]) {
                k--;
            }
            ans[i] = (k == 0 ? n - ans[i] : stk[k - 1] - ans[i]) - 1;
            stk[k++] = i;
        }

        return ans;
    }

}

package org.huhu.leetcode.n1673;

class SolutionA implements Solution {

    @Override
    public int[] mostCompetitive(int[] nums, int k) {
        int n = nums.length, m = 0;
        int[] stk = new int[k];
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            while (m > 0 && x < stk[m - 1] && m + n - i > k) {
                m--;
            }
            if (m < k) {
                stk[m++] = x;
            }
        }
        return stk;
    }

}

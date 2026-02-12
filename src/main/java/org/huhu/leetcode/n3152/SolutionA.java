package org.huhu.leetcode.n3152;

class SolutionA implements Solution {

    @Override
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] p = new int[n];
        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1] + (((nums[i - 1] ^ nums[i]) & 1) == 1 ? 0 : 1);
        }
        n = queries.length;
        boolean[] ans = new boolean[n];
        for (int i = 0; i < n; i++) {
            int[] q = queries[i];
            ans[i] = p[q[0]] == p[q[1]];
        }
        return ans;
    }

}

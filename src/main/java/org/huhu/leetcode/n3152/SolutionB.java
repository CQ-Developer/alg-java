package org.huhu.leetcode.n3152;

class SolutionB implements Solution {

    @Override
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = ((nums[i - 1] ^ nums[i]) & 1) == 1 ? dp[i - 1] + 1 : 1;
        }
        n = queries.length;
        boolean[] ans = new boolean[n];
        for (int i = 0; i < n; i++) {
            int j = queries[i][1];
            if (j - queries[i][0] + 1 <= dp[j]) {
                ans[i] = true;
            }
        }
        return ans;
    }

}

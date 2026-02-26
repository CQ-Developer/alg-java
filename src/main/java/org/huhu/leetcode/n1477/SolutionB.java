package org.huhu.leetcode.n1477;

class SolutionB implements Solution {

    @Override
    public int minSumOfLength(int[] arr, int target) {
        int n = arr.length;

        int[] dp = new int[n + 1];
        dp[0] = n;

        int ans = n + 1, sum = 0;

        for (int l = 0, r = 0; r < n; r++) {
            sum += arr[r];
            for (; sum > target; l++) {
                sum -= arr[l];
            }
            if (sum == target) {
                ans = Math.min(ans, r - l + 1 + dp[l]);
                dp[r + 1] = Math.min(dp[r], r - l + 1);
            } else {
                dp[r + 1] = dp[r];
            }
        }
        return ans == n + 1 ? -1 : ans;
    }

}

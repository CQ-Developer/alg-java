package org.huhu.leetcode.n1277;

/**
 * 动态规划(空间压缩)
 */
class SolutionC implements Solution {

    @Override
    public int countSquares(int[][] matrix) {
        int n = matrix[0].length;
        int[] dp = new int[n + 1];
        int cnt = 0;
        for (int[] row : matrix) {
            int pre = 0;
            for (int j = 0; j < n; j++) {
                int tmp = dp[j + 1];
                dp[j + 1] = row[j] == 1 ? Math.min(pre, Math.min(dp[j], dp[j + 1])) + 1 : 0;
                cnt += dp[j + 1];
                pre = tmp;
            }
        }
        return cnt;
    }

}

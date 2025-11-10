package org.huhu.leetcode.n1277;

/**
 * 动态规划
 */
class SolutionB implements Solution {

    @Override
    public int countSquares(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    dp[i + 1][j + 1] = Math.min(dp[i][j], Math.min(dp[i + 1][j], dp[i][j + 1])) + 1;
                    cnt += dp[i + 1][j + 1];
                }
            }
        }
        return cnt;
    }

}

package org.huhu.leetcode.n1130;

import java.util.Arrays;

/**
 * 动态规划
 */
class SolutionA implements Solution {

    @Override
    public int mctFromLeafValues(int[] arr) {
        int n = arr.length;
        // dp[i][j] 表示区间 i...j 上的非叶节点的值的最小总和
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE >> 2);
        }
        // max[i][j] 表示区间 i...j 上的最大值
        int[][] max = new int[n][n];
        for (int j = 0; j < n; j++) {
            // max[j][j] 表示区间 i...j 上的最大值只可能是 arr[j]
            max[j][j] = arr[j];
            // dp[j][j] 只可能是叶子节点，所以非叶节点的值的最小总不存在
            dp[j][j] = 0;
            for (int i = j - 1; i >= 0; i--) {
                // 动态更新 i...j 区间的最大值
                max[i][j] = Math.max(arr[i], max[i + 1][j]);
                for (int k = i; k < j; k++) {
                    // 遍历在区间 i...j 上所有可能的切分点 k
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + max[i][k] * max[k + 1][j]);
                }
            }
        }
        return dp[0][n - 1];
    }

}

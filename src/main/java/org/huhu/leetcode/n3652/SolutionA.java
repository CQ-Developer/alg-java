package org.huhu.leetcode.n3652;

class SolutionA implements Solution {

    @Override
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long[] pre = new long[n + 1];
        long[] sum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + prices[i];
            sum[i + 1] = sum[i] + prices[i] * strategy[i];
        }
        long max = sum[n];
        for (int i = k; i <= n; i++) {
            max = Math.max(max, sum[i - k] + sum[n] - sum[i] + pre[i] - pre[i - k / 2]);
        }
        return max;
    }

}

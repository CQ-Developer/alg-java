package org.huhu.leetcode.n3652;

class SolutionB implements Solution {

    @Override
    public long maxProfit(int[] prices, int[] strategy, int k) {
        long total = 0, sum = 0, maxSum = 0;
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            int p = prices[i], s = strategy[i];
            total += p * s;

            // 下标i进入右半部分, 策略变为1
            sum += p * (1 - s);

            // 定长窗口
            if (i < k - 1) {
                // i - k/2 + 1 将从右侧进入左侧, 策略1变为0
                if (i >= k / 2 - 1) {
                    sum -= prices[i - k / 2 + 1];
                }
                continue;
            }

            // 更新结果
            maxSum = Math.max(maxSum, sum);

            // 左侧元素离开窗口
            // i - k/2 + 1 从右侧进入左侧
            // i - k + 1 从左侧离开窗口
            sum -= prices[i - k / 2 + 1] - prices[i - k + 1] * strategy[i - k + 1];
        }
        return total + maxSum;
    }

}

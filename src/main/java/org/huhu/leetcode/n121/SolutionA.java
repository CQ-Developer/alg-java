package org.huhu.leetcode.n121;

class SolutionA implements Solution {

    @Override
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            buy = Math.min(price, buy);
            profit = Math.max(profit, price - buy);
        }
        return profit;
    }

}

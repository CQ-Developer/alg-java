package org.huhu.leetcode.n901;

import java.util.ArrayDeque;
import java.util.Deque;

class StockSpannerB implements StockSpanner {

    private int day;
    private final Deque<int[]> stack = new ArrayDeque<>();

    public StockSpannerB() {
        this.day = -1;
        this.stack.push(new int[] { -1, Integer.MAX_VALUE });
    }

    @Override
    public int next(int price) {
        while (price >= stack.peek()[1]) {
            stack.pop();
        }
        day++;
        int cnt = day - stack.peek()[0];
        stack.push(new int[] { day, price });
        return cnt;
    }

}

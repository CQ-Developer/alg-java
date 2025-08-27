package org.huhu.leetcode.n901;

import java.util.ArrayList;
import java.util.List;

class StockSpannerA implements StockSpanner {

    private final List<Integer> stack;

    public StockSpannerA() {
        this.stack = new ArrayList<>();
    }

    @Override
    public int next(int price) {
        stack.add(price);
        int cnt = 0;
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (price >= stack.get(i)) {
                cnt++;
            } else {
                break;
            }
        }
        return cnt;
    }

}

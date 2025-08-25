package org.huhu.leetcode.n1475;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionB implements Solution {

    @Override
    public int[] finalPrices(int[] prices) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for (int i = prices.length - 1; i >= 0; i--) {
            int x = prices[i];
            while (stack.size() > 1 && x < stack.peek()) {
                stack.poll();
            }
            prices[i] -= stack.peek();
            stack.push(x);
        }
        return prices;
    }

}

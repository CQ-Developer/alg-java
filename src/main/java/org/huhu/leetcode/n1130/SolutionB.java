package org.huhu.leetcode.n1130;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 单调栈
 */
class SolutionB implements Solution {

    @Override
    public int mctFromLeafValues(int[] arr) {
        int sum = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int x : arr) {
            while (!stack.isEmpty() && x >= stack.peek()) {
                int y = stack.pop();
                if (stack.isEmpty() || stack.peek() > x) {
                    sum += y * x;
                } else {
                    sum += y * stack.peek();
                }
            }
            stack.push(x);
        }
        while (stack.size() > 1) {
            int x = stack.pop();
            sum += stack.peek() * x;
        }
        return sum;
    }

}

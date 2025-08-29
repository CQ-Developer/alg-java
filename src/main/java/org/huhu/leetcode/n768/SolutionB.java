package org.huhu.leetcode.n768;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionB implements Solution {

    @Override
    public int maxChunksToSorted(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int x : arr) {
            if (stack.isEmpty() || x >= stack.peek()) {
                stack.push(x);
            } else {
                int y = stack.pop();
                while (!stack.isEmpty() && stack.peek() > x) {
                    stack.pop();
                }
                stack.push(y);
            }
        }
        return stack.size();
    }

}

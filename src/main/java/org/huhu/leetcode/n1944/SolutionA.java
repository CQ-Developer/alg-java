package org.huhu.leetcode.n1944;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionA implements Solution {

    @Override
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] seen = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[i] > stack.peek()) {
                stack.pop();
                seen[i]++;
            }
            if (!stack.isEmpty()) {
                seen[i]++;
            }
            stack.push(heights[i]);
        }
        return seen;
    }

}

package org.huhu.leetcode.n84;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 同 {@link SolutionC} 算法, 将栈顶元素视为矩形的高.
 */
class SolutionD implements Solution {

    @Override
    public int largestRectangleArea(int[] heights) {
        int mx = 0, n = heights.length;
        Deque<Integer> stk = new ArrayDeque<>();
        stk.push(-1);
        for (int r = 0; r <= n; r++) {
            int h = r < n ? heights[r] : -1;
            while (stk.size() > 1 && heights[stk.peek()] >= h) {
                int height = heights[stk.pop()];
                int l = stk.peek();
                mx = Math.max(mx, height * (r - l - 1));
            }
            stk.push(r);
        }
        return mx;
    }

}

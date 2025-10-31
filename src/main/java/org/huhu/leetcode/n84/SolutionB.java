package org.huhu.leetcode.n84;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 以 heights[i] 作为矩形高度，找到最大宽度
 */
class SolutionB implements Solution {

    @Override
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Deque<Integer> stk = new ArrayDeque<>();
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            // 左侧小于 heights[i] 的最近位置
            while (!stk.isEmpty() && heights[i] <= heights[stk.peek()]) {
                stk.pop();
            }
            left[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        stk.clear();
        int[] right = new int[n];
        for (int i = n - 1; i > -1; i--) {
            // 右侧小于 heigths[i] 的最近位置
            while (!stk.isEmpty() && heights[i] <= heights[stk.peek()]) {
                stk.pop();
            }
            right[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }
        int mx = 0;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, (right[i] - left[i] - 1) * heights[i]);
        }
        return mx;
    }

}

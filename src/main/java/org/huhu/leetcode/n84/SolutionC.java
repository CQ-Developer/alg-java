package org.huhu.leetcode.n84;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 同 {@link SolutionB} 算法.
 * 但如果栈顶元素大于 heights[i]，那么栈顶元素的最右边就是 i.
 */
class SolutionC implements Solution {

    @Override
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stk = new ArrayDeque<>();
        int n = heights.length;
        int[] left = new int[n], right = new int[n];
        for (int i = 0; i < n; i++) {
            right[i] = n;
            while (!stk.isEmpty() && heights[stk.peek()] >= heights[i]) {
                // 当以栈顶元素为矩形的高时，那么i就是矩形的右边界
                right[stk.pop()] = i;
            }
            left[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        int mx = 0;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, heights[i] * (right[i] - left[i] - 1));
        }
        return mx;
    }

}

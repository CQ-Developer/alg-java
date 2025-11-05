package org.huhu.leetcode.n42;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionC implements Solution {

    @Override
    public int trap(int[] height) {
        int ans = 0;
        Deque<Integer> stk = new ArrayDeque<>();
        for (int r = 0; r < height.length; r++) {
            while (!stk.isEmpty() && height[stk.peek()] <= height[r]) {
                int i = height[stk.pop()];
                if (stk.isEmpty()) {
                    break;
                }
                int l = stk.peek();
                int h = Math.min(height[l], height[r]) - i;
                ans += h * (r - l - 1);
            }
            stk.push(r);
        }
        return ans;
    }

}

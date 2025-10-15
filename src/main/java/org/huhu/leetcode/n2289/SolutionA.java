package org.huhu.leetcode.n2289;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionA implements Solution {

    @Override
    public int totalSteps(int[] nums) {
        int ans = 0;
        Deque<int[]> stack = new ArrayDeque<>();
        for (int x : nums) {
            int mx = 0;
            while (!stack.isEmpty() && x >= stack.peek()[0]) {
                mx = Math.max(mx, stack.pop()[1]);
            }
            mx = stack.isEmpty() ? 0 : mx + 1;
            ans = Math.max(ans, mx);
            stack.push(new int[] { x, mx });
        }
        return ans;
    }

}

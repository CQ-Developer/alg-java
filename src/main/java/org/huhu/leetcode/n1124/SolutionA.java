package org.huhu.leetcode.n1124;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionA implements Solution {

    @Override
    public int longestWPI(int[] hours) {
        int n = hours.length;
        int[] pre = new int[n + 1];
        Deque<Integer> stk = new ArrayDeque<>();
        stk.push(0);
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1] + (hours[i - 1] > 8 ? 1 : -1);
            if (pre[i] < pre[stk.peek()]) {
                stk.push(i);
            }
        }
        int ans = 0;
        for (int i = n; i > 0; i--) {
            while (!stk.isEmpty() && pre[i] > pre[stk.peek()]) {
                ans = Math.max(ans, i - stk.pop());
            }
        }
        return ans;
    }

}

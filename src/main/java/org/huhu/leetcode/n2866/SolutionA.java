package org.huhu.leetcode.n2866;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

class SolutionA implements Solution {

    @Override
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int n = maxHeights.size();

        long s = 0;
        long[] suf = new long[n + 1];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(n);
        for (int i = n - 1; i >= 0; i--) {
            while (stack.size() > 1 && maxHeights.get(i) <= maxHeights.get(stack.peek())) {
                int j = stack.pop();
                s -= (long) maxHeights.get(j) * (stack.peek() - j);
            }
            s += (long) maxHeights.get(i) * (stack.peek() - i);
            suf[i] = s;
            stack.push(i);
        }

        long pre = 0;
        stack.clear();
        stack.push(-1);
        for (int i = 0; i < n; i++) {
            while (stack.size() > 1 && maxHeights.get(i) <= maxHeights.get(stack.peek())) {
                int j = stack.pop();
                pre -= (long) maxHeights.get(j) * (j - stack.peek());
            }
            pre += (long) maxHeights.get(i) * (i - stack.peek());
            s = Math.max(s, pre + suf[i + 1]);
            stack.push(i);
        }

        return s;
    }

}

package org.huhu.leetcode.n2281;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionA implements Solution {

    private static final int M = 1000000007;

    @Override
    public int totalStrength(int[] strength) {
        int n = strength.length;

        int[] left = new int[n], right = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        for (int i = 0; i < n; i++) {
            right[i] = n;
            while (stack.size() > 1 && strength[stack.peek()] >= strength[i]) {
                right[stack.pop()] = i;
            }
            left[i] = stack.peek();
            stack.push(i);
        }

        long s = 0;
        int[] ss = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            s += strength[i - 1];
            ss[i + 1] = (int) ((ss[i] + s) % M);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            int l = left[i] + 1, r = right[i] - 1;
            long total = ((i - l + 1L) * (ss[r + 2] - ss[i + 1]) - (r - i + 1L) * (ss[i + 1] - ss[l])) % M;
            ans = (ans + strength[i] * total) % M;
        }

        return (int) (ans + M) % M;
    }

}

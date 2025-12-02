package org.huhu.leetcode.tianchi2022.ev2bru.q3;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int[] arrangeBookshelf(int[] order, int limit) {
        int mx = 1000000;

        int[] remaining = new int[mx + 1], inside = new int[mx + 1];
        for (int i : order) {
            remaining[i]++;
        }

        int n = 0;
        int[] stack = new int[order.length];

        for (int x : order) {
            remaining[x]--;
            if (inside[x] == limit) {
                continue;
            }
            while (n > 0 && x < stack[n - 1] && remaining[stack[n - 1]] + inside[stack[n - 1]] > limit) {
                int y = stack[--n];
                inside[y]--;
            }
            stack[n++] = x;
            inside[x]++;
        }

        return Arrays.copyOfRange(stack, 0, n);
    }

}

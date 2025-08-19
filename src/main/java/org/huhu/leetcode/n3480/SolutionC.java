package org.huhu.leetcode.n3480;

import java.util.Arrays;

class SolutionC implements Solution {

    @Override
    public long maxSubarrays(int n, int[][] conflictingPairs) {
        int[] g0 = new int[n + 1], g1 = new int[n + 1];
        Arrays.fill(g0, n + 1);
        Arrays.fill(g1, n + 1);
        for (int[] p : conflictingPairs) {
            int a = p[0], b = p[1];
            if (a > b) {
                int t = a;
                a = b;
                b = t;
            }
            if (b < g0[a]) {
                g1[a] = g0[a];
                g0[a] = b;
            } else if (b < g1[a]) {
                g1[a] = b;
            }
        }
        long ans = 0, mx = 0, ex = 0;
        int b0 = n + 1, b1 = n + 1;
        for (int i = n; i > 0; i--) {
            int _b0 = b0;
            if (g0[i] < b0) {
                b1 = Math.min(b0, g1[i]);
                b0 = g0[i];
            } else if (g0[i] < b1) {
                b1 = g0[i];
            }
            ans += b0 - i;
            if (b0 != _b0) {
                ex = 0;
            }
            ex += b1 - b0;
            mx = Math.max(mx, ex);
        }
        return ans + mx;
    }

}

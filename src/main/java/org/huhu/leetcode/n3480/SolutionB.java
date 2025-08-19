package org.huhu.leetcode.n3480;

import java.util.ArrayList;
import java.util.List;

class SolutionB implements Solution {

    @Override
    public long maxSubarrays(int n, int[][] conflictingPairs) {
        List<List<Integer>> groups = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            groups.add(new ArrayList<>());
        }
        for (int[] p : conflictingPairs) {
            int i = p[0], j = p[1];
            groups.get(Math.min(i, j)).add(Math.max(i, j));
        }
        long ans = 0, mx = 0, ex = 0;
        int b0 = n + 1, b1 = n + 1;
        for (int i = n; i > 0; i--) {
            int _b0 = b0;
            for (int b : groups.get(i)) {
                if (b < b0) {
                    b1 = b0;
                    b0 = b;
                } else if (b < b1) {
                    b1 = b;
                }
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

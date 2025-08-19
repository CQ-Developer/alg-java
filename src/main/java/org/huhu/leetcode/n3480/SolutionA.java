package org.huhu.leetcode.n3480;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SolutionA implements Solution {

    @Override
    public long maxSubarrays(int n, int[][] conflictingPairs) {
        List<List<Integer>> groups = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            groups.add(new ArrayList<>());
        }
        for (int[] pair : conflictingPairs) {
            int a = pair[0], b = pair[1];
            groups.get(Math.min(a, b)).add(Math.max(a, b));
        }
        long ans = 0, maxExtra = 0;
        long[] extra = new long[n + 2];
        List<Integer> b = new ArrayList<>();
        b.add(n + 1);
        b.add(n + 1);
        for (int i = n; i > 0; i--) {
            b.addAll(groups.get(i));
            Collections.sort(b);
            b.subList(2, b.size()).clear();
            int b0 = b.get(0);
            ans += b0 - i;
            extra[b0] += b.get(1) - b0;
            maxExtra = Math.max(maxExtra, extra[b0]);
        }
        return ans + maxExtra;
    }

}

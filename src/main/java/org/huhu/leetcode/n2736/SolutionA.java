package org.huhu.leetcode.n2736;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionA implements Solution {

    @Override
    public int[] maximumSumQueries(int[] nums1, int[] nums2, int[][] queries) {
        int n = nums1.length;
        int[][] pairs = new int[n][];
        for (int i = 0; i < n; i++) {
            pairs[i] = new int[] { nums1[i], nums2[i] };
        }
        Arrays.sort(pairs, (x, y) -> y[0] - x[0]);

        int m = queries.length;
        int[] ans = new int[m];
        List<Integer> idx = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            idx.add(i);
            ans[i] = -1;
        }
        idx.sort((i, j) -> queries[j][0] - queries[i][0]);

        int j = 0, k = -1;
        int[][] sk = new int[n][];
        for (int i : idx) {
            int x = queries[i][0], y = queries[i][1];
            for (; j < n && pairs[j][0] >= x; j++) {
                int b = pairs[j][1], sum = pairs[j][0] + pairs[j][1];
                while (k > -1 && sum >= sk[k][1]) {
                    --k;
                }
                if (k == -1 || b > sk[k][0]) {
                    sk[++k] = new int[] { b, sum };
                }
            }
            int p = lowerBound(sk, k + 1, y);
            if (p <= k) {
                ans[i] = sk[p][1];
            }
        }

        return ans;
    }

    private int lowerBound(int[][] sk, int n, int target) {
        int l = -1, r = n;
        while (l + 1 < r) {
            int i = (l + r) >> 1;
            if (sk[i][0] >= target) {
                r = i;
            } else {
                l = i;
            }
        }
        return r;
    }

}

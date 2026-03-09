package org.huhu.leetcode.n1074;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int ans = 0;
        for (int t = 0; t < m; t++) {
            int[] pre = new int[n];
            for (int i = t; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    pre[j] += matrix[i][j];
                }
                int s = 0;
                Map<Integer, Integer> cnt = new HashMap<>();
                for (int x : pre) {
                    cnt.merge(s, 1, Integer::sum);
                    s += x;
                    ans += cnt.getOrDefault(s - target, 0);
                }
            }
        }
        return ans;
    }

}

package org.huhu.leetcode.n2711;

import java.util.HashSet;
import java.util.Set;

class SolutionA implements Solution {

    @Override
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m][n];
        Set<Integer> set = new HashSet<>();
        for (int k = 1; k < m + n; k++) {
            int minJ = Math.max(n - k, 0), maxJ = Math.min(m + n - 1 - k, n - 1);
            set.clear();
            for (int j = minJ; j <= maxJ; j++) {
                int i = k + j - n;
                ans[i][j] = set.size();
                set.add(grid[i][j]);
            }
            set.clear();
            for (int j = maxJ; j >= minJ; j--) {
                int i = k + j - n;
                ans[i][j] = Math.abs(ans[i][j] - set.size());
                set.add(grid[i][j]);
            }
        }
        return ans;
    }

}

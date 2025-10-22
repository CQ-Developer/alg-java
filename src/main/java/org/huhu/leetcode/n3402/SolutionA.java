package org.huhu.leetcode.n3402;

class SolutionA implements Solution {

    @Override
    public int minimumOperations(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int ops = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                int d = grid[i][j] - grid[i - 1][j];
                if (d <= 0) {
                    ops += 1 - d;
                    grid[i][j] += 1 - d;
                }
            }
        }
        return ops;
    }

}

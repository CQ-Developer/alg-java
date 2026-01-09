package org.huhu.leetcode.n3128;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public long numberOfRightTriangles(int[][] grid) {
        long cnt = 0;
        int m = grid.length, n = grid[0].length;
        int[] col = new int[n];
        Arrays.fill(col, -1);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                col[j] += grid[i][j];
            }
        }
        for (int[] row : grid) {
            int sum = -1;
            for (int x : row) {
                sum += x;
            }
            for (int j = 0; j < n; j++) {
                if (row[j] == 1) {
                    cnt += sum * col[j];
                }
            }
        }
        return cnt;
    }

}

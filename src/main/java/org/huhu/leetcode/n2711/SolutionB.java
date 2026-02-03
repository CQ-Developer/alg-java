package org.huhu.leetcode.n2711;

class SolutionB implements Solution {

    @Override
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m][n];
        for (int k = 1; k < m + n; k++) {
            int mn = Math.max(n - k, 0), mx = Math.min(m + n - 1 - k, n - 1);
            long bit = 0;
            for (int j = mn; j <= mx; j++) {
                int i = k + j - n;
                ans[i][j] = Long.bitCount(bit);
                bit |= 1L << grid[i][j];
            }
            bit = 0;
            for (int j = mx; j >= mn; j--) {
                int i = k + j - n;
                ans[i][j] = Math.abs(ans[i][j] - Long.bitCount(bit));
                bit |= 1L << grid[i][j];
            }
        }
        return ans;
    }

}

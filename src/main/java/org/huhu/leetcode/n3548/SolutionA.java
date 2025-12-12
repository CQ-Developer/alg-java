package org.huhu.leetcode.n3548;

import java.util.HashSet;
import java.util.Set;

class SolutionA implements Solution {

    @Override
    public boolean canPartitionGrid(int[][] grid) {
        long total = 0;
        for (int[] row : grid) {
            for (int x : row) {
                total += x;
            }
        }
        return check(grid, total) || check(rotate(grid), total);
    }

    private boolean check(int[][] grid, long total) {
        return doPart(grid, total) || doPart(flip(grid), total);
    }

    private boolean doPart(int[][] grid, long total) {
        long sum = 0;
        int m = grid.length, n = grid[0].length;
        Set<Long> set = new HashSet<>();
        set.add(0L);
        for (int i = 0; i < m; i++) {
            int[] row = grid[i];
            for (int j = 0; j < n; j++) {
                sum += row[j];
                if (i > 0 || j == 0 || j == n - 1) {
                    set.add((long) row[j]);
                }
            }
            if (n == 1) {
                if (2 * sum == total || 2 * sum - total == 0 || 2 * sum - total == grid[0][0] || 2 * sum - total == row[0]) {
                    return true;
                }
                continue;
            }
            if (set.contains(2 * sum - total)) {
                return true;
            }
            if (i == 0) {
                for (int x : row) {
                    set.add((long) x);
                }
            }
        }
        return false;
    }

    /**
     * flip upside down
     */
    private int[][] flip(int[][] grid) {
        int i = 0, j = grid.length - 1;
        while (i < j) {
            int[] g = grid[i];
            grid[i++] = grid[j];
            grid[j--] = g;
        }
        return grid;
    }

    /**
     * rotate 90 degrees clockwise
     */
    private int[][] rotate(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] roated = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                roated[j][i] = grid[i][j];
            }
        }
        return roated;
    }

}

package org.huhu.leetcode.n778;

class SolutionA implements Solution {

    @Override
    public int swimInWater(int[][] grid) {
        int l = grid[0][0], r = Integer.MIN_VALUE;
        for (int[] g : grid) {
            for (int x : g) {
                r = Math.max(r, x);
            }
        }
        int m = grid.length, n = grid[0].length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (check(grid, new boolean[m][n], 0, 0, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    private boolean check(int[][] grid, boolean[][] visited, int i, int j, int mx) {
        if (i == grid.length - 1 && j == grid[i].length - 1) {
            return true;
        }
        visited[i][j] = true;
        if (i > 0 && !visited[i - 1][j] && grid[i - 1][j] <= mx && check(grid, visited, i - 1, j, mx)) {
            return true;
        }
        if (i + 1 < grid.length && !visited[i + 1][j] && grid[i + 1][j] <= mx && check(grid, visited, i + 1, j, mx)) {
            return true;
        }
        if (j > 0 && !visited[i][j - 1] && grid[i][j - 1] <= mx && check(grid, visited, i, j - 1, mx)) {
            return true;
        }
        if (j + 1 < grid[i].length && !visited[i][j + 1] && grid[i][j + 1] <= mx && check(grid, visited, i, j + 1, mx)) {
            return true;
        }
        return false;
    }

}

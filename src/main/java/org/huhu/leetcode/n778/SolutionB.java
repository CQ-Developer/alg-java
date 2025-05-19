package org.huhu.leetcode.n778;

import java.util.ArrayDeque;
import java.util.Queue;

class SolutionB implements Solution {

    private static final int[][] D = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    @Override
    public int swimInWater(int[][] grid) {
        int l = grid[0][0], r = 0;
        for (int[] g : grid) {
            for (int x : g) {
                r = Math.max(r, x);
            }
        }
        while (l < r) {
            int m = l + (r - l) / 2;
            if (check(grid, m)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return r;
    }

    private boolean check(int[][] grid, int mx) {
        int m = grid.length, n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        vis[0][0] = true;
        Queue<int[]> que = new ArrayDeque<>();
        que.add(new int[] { 0, 0 });
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int i = cur[0], j = cur[1];
            for (int[] d : D) {
                int x = i + d[0], y = j + d[1];
                if (x >= 0 && x < m && y >= 0 && y < n && !vis[x][y] && grid[x][y] <= mx) {
                    que.offer(new int[] { x, y });
                    vis[x][y] = true;
                }
            }
        }
        return vis[m - 1][n - 1];
    }

}

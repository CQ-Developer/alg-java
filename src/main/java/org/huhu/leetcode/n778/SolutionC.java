package org.huhu.leetcode.n778;

import java.util.PriorityQueue;
import java.util.Queue;

class SolutionC implements Solution {

    private static final int[][] D = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    @Override
    public int swimInWater(int[][] grid) {
        int res = 0;

        int m = grid.length, n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        vis[0][0] = true;

        Queue<int[]> que = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        que.offer(new int[] { grid[0][0], 0, 0 });

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int g = cur[0], i = cur[1], j = cur[2];
            res = Math.max(res, g);
            if (i == m - 1 && j == n - 1) {
                break;
            }
            for (int[] d : D) {
                int x = i + d[0], y = j + d[1];
                if (x >= 0 && x < m && y >= 0 && y < n && !vis[x][y]) {
                    que.offer(new int[] { grid[x][y], x, y });
                    vis[x][y] = true;
                }
            }
        }

        return res;
    }

}

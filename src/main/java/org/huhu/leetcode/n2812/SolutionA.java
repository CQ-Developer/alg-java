package org.huhu.leetcode.n2812;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

class SolutionA implements Solution {

    private static final int[][] D = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    @Override
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] dis = new int[n][n];
        Queue<int[]> que = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dis[i][j] = -1;
                if (grid.get(i).get(j) == 1) {
                    que.offer(new int[] { i, j });
                    dis[i][j] = 0;
                }
            }
        }
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int i = cur[0], j = cur[1];
            for (int[] d : D) {
                int x = i + d[0], y = j + d[1];
                if (x >= 0 && x < n && y >= 0 && y < n && dis[x][y] == -1) {
                    que.offer(new int[] { x, y });
                    dis[x][y] = dis[i][j] + 1;
                }
            }
        }
        int l = 0, r = Math.min(dis[0][0], dis[n - 1][n - 1]);
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (check(dis, n, m)) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

    private boolean check(int[][] dis, int n, int m) {
        boolean[][] vis = new boolean[n][n];
        vis[0][0] = true;
        Queue<int[]> que = new ArrayDeque<>();
        que.offer(new int[] { 0, 0 });
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int i = cur[0], j = cur[1];
            for (int[] d : D) {
                int x = i + d[0], y = j + d[1];
                if (x >= 0 && x < n && y >= 0 && y < n && !vis[x][y] && dis[x][y] >= m) {
                    vis[x][y] = true;
                    que.offer(new int[] { x, y });
                }
            }
        }
        return vis[n - 1][n - 1];
    }

}

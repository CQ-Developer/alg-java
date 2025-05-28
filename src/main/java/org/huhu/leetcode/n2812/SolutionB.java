package org.huhu.leetcode.n2812;

import java.util.ArrayList;
import java.util.List;

class SolutionB implements Solution {

    private final static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };

    @Override
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        // 初始化
        List<int[]> que = new ArrayList<>();
        int[][] dis = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    que.add(new int[] { i, j });
                } else {
                    dis[i][j] = -1;
                }
            }
        }
        // 多源BFS
        List<List<int[]>> groups = new ArrayList<>();
        groups.add(que);
        while (!que.isEmpty()) {
            var tmp = que;
            que = new ArrayList<>();
            for (int[] p : tmp) {
                for (int[] d : dir) {
                    int x = p[0] + d[0], y = p[1] + d[1];
                    if (0 <= x && x < n && 0 <= y && y < n && dis[x][y] == -1) {
                        que.add(new int[] { x, y });
                        dis[x][y] = groups.size();
                    }
                }
            }
            groups.add(que);
        }
        // 初始化并查集
        int[] f = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            f[i] = i;
        }
        // bfs
        for (int g = groups.size() - 2; g > 0; g--) {
            for (int[] p : groups.get(g)) {
                int i = p[0], j = p[1];
                for (int[] d : dir) {
                    int x = i + d[0], y = j + d[1];
                    if (0 <= x && x < n && 0 <= y && y < n && dis[x][y] >= dis[i][j]) {
                        f[find(f, x * n + y)] = find(f, i * n + j);
                    }
                }
            }
            if (find(f, 0) == find(f, n * n - 1)) {
                return g;
            }
        }
        return 0;
    }

    /**
     * 并查集模板
     */
    private int find(int[] f, int x) {
        if (f[x] != x) {
            f[x] = find(f, f[x]);
        }
        return f[x];
    }

}

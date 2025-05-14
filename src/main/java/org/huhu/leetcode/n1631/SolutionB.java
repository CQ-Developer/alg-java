package org.huhu.leetcode.n1631;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * binary search
 * breadth first search
 */
class SolutionB implements Solution {

    private static final int[][] D = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    @Override
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        int[][] visited = new int[m][n];
        int l = 0, r = 1_000_000, v = 0;
        while (l < r) {
            int mid = l + (r - l) / 2;
            visited[0][0] = ++v;
            queue.offer(new int[] { 0, 0 });
            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                int i = cur[0], j = cur[1];
                for (int[] d : D) {
                    int x = i + d[0], y = j + d[1];
                    if (0 <= x && x < m && 0 <= y && y < n && visited[x][y] != v && Math.abs(heights[i][j] - heights[x][y]) <= mid) {
                        queue.offer(new int[] { x, y });
                        visited[x][y] = v;
                    }
                }
            }
            if (visited[m - 1][n - 1] == v) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

}

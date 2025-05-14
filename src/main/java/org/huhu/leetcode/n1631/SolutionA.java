package org.huhu.leetcode.n1631;

/**
 * binary search
 * deep first search
 */
class SolutionA implements Solution {

    public int minimumEffortPath(int[][] heights) {
        int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE;
        for (int[] height : heights) {
            for (int h : height) {
                mn = Math.min(mn, h);
                mx = Math.max(mx, h);
            }
        }
        int m = heights.length, n = heights[0].length;
        int f = 0;
        int[][] visited = new int[m][n];
        int l = 0, r = mx - mn;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (dfs(visited, ++f, heights, m, n, 0, 0, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    private boolean dfs(int[][] vi, int v, int[][] he, int m, int n, int i, int j, int mx) {
        if (i == m - 1 && j == n - 1) {
            return true;
        }
        vi[i][j] = v;
        if (i + 1 < m && vi[i + 1][j] != v && Math.abs(he[i][j] - he[i + 1][j]) <= mx && dfs(vi, v, he, m, n, i + 1, j, mx)) {
            return true;
        }
        if (i >= 1 && vi[i - 1][j] != v && Math.abs(he[i][j] - he[i - 1][j]) <= mx && dfs(vi, v, he, m, n, i - 1, j, mx)) {
            return true;
        }
        if (j + 1 < n && vi[i][j + 1] != v && Math.abs(he[i][j] - he[i][j + 1]) <= mx && dfs(vi, v, he, m, n, i, j + 1, mx)) {
            return true;
        }
        if (j >= 1 && vi[i][j - 1] != v && Math.abs(he[i][j] - he[i][j - 1]) <= mx && dfs(vi, v, he, m, n, i, j - 1, mx)) {
            return true;
        }
        return false;
    }

}

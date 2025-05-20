package org.huhu.leetcode.n3419;

import java.util.ArrayList;
import java.util.List;

class SolutionA implements Solution {

    @Override
    public int minMaxWeight(int n, int[][] edges, int threshold) {
        if (edges.length < n - 1) {
            return -1;
        }
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        int mxW = 0;
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1], w = edge[2];
            graph.get(y).add(new int[] { x, w });
            mxW = Math.max(mxW, w);
        }
        int[] vis = new int[n];
        int l = 1, r = mxW + 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (check(graph, vis, 0, mid) == n) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r > mxW ? -1 : r;
    }

    private int check(List<List<int[]>> g, int[] vis, int x, int mx) {
        vis[x] = mx;
        int rest = 1;
        for (int[] edge : g.get(x)) {
            int y = edge[0];
            if (edge[1] <= mx && vis[y] != mx) {
                rest += check(g, vis, y, mx);
            }
        }
        return rest;
    }

}

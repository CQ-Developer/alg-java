package org.huhu.leetcode.n3067;

import java.util.ArrayList;
import java.util.List;

class SolutionA implements Solution {

    private record Edge(int node, int weight) {
    }

    @Override
    public int[] countPairsOfConnectableServers(int[][] edges, int signalSpeed) {
        int n = edges.length + 1;
        List<List<Edge>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1], w = edge[2];
            g.get(a).add(new Edge(b, w));
            g.get(b).add(new Edge(a, w));
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            List<Edge> root = g.get(i);
            if (root.size() > 1) {
                int pre = 0;
                for (var edge : root) {
                    int cnt = dfs(edge.node, i, edge.weight, g, signalSpeed);
                    ans[i] += cnt * pre;
                    pre += cnt;
                }
            }
        }
        return ans;
    }

    private int dfs(int node, int from, int sum, List<List<Edge>> g, int signalSpeed) {
        int cnt = sum % signalSpeed == 0 ? 1 : 0;
        for (Edge edge : g.get(node)) {
            int to = edge.node;
            if (to != from) {
                cnt += dfs(to, node, sum + edge.weight, g, signalSpeed);
            }
        }
        return cnt;
    }

}

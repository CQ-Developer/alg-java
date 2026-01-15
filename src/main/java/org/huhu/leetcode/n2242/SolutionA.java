package org.huhu.leetcode.n2242;

import java.util.ArrayList;
import java.util.List;

class SolutionA implements Solution {

    @Override
    public int maximumScore(int[] scores, int[][] edges) {
        int n = scores.length;
        List<List<Integer>> g = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            g.get(a).add(b);
            g.get(b).add(a);
        }
        for (int i = 0; i < n; i++) {
            List<Integer> list = g.get(i);
            if (list.size() > 3) {
                list.sort((a, b) -> scores[b] - scores[a]);
                g.set(i, list.subList(0, 3));
            }
        }
        int ans = -1;
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1];
            for (int a : g.get(x)) {
                for (int b : g.get(y)) {
                    if (a != y && b != x && a != b) {
                        ans = Math.max(ans, scores[a] + scores[x] + scores[y] + scores[b]);
                    }
                }
            }
        }
        return ans;
    }

}

package org.huhu.leetcode.n2867;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionA implements Solution {

    private static final boolean[] is_prime = new boolean[100000 + 1];

    static {
        Arrays.fill(is_prime, true);
        is_prime[0] = is_prime[1] = false;
        for (int i = 2; i * i <= 100000; i++) {
            if (is_prime[i]) {
                for (int j = i * i; j <= 100000; j += i) {
                    is_prime[j] = false;
                }
            }
        }
    }

    @Override
    public long countPaths(int n, int[][] edges) {
        List<List<Integer>> g = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            g.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            g.get(u).add(v);
            g.get(v).add(u);
        }
        long ans = 0;
        int[] cache = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (is_prime[i]) {
                long sum = 0;
                for (int j : g.get(i)) {
                    if (is_prime[j]) {
                        continue;
                    }
                    if (cache[j] == 0) {
                        List<Integer> nodes = new ArrayList<>();
                        dfs(g, nodes, i, j);
                        for (int k : nodes) {
                            cache[k] = nodes.size();
                        }
                    }
                    ans += sum * cache[j];
                    sum += cache[j];
                }
                ans += sum;
            }
        }
        return ans;
    }

    private void dfs(List<List<Integer>> g, List<Integer> nodes, int i, int j) {
        nodes.add(j);
        for (int k : g.get(j)) {
            if (k != i && !is_prime[k]) {
                dfs(g, nodes, j, k);
            }
        }
    }

}

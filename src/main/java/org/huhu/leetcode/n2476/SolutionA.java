package org.huhu.leetcode.n2476;

import java.util.ArrayList;
import java.util.List;

class SolutionA implements Solution {

    @Override
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> a = new ArrayList<>();
        dfs(root, a);
        int n = a.size();
        List<List<Integer>> res = new ArrayList<>();
        for (int x : queries) {
            int l = -1, r = n;
            while (l + 1 < r) {
                int i = l + (r - l) / 2;
                if (a.get(i) >= x) {
                    r = i;
                } else {
                    l = i;
                }
            }
            int max = r < n ? a.get(r) : -1;
            if (r == n || a.get(r) != x) {
                r--;
            }
            int min = r >= 0 ? a.get(r) : -1;
            res.add(List.of(min, max));
        }
        return res;
    }

    private void dfs(TreeNode root, List<Integer> a) {
        if (root != null) {
            dfs(root.left, a);
            a.add(root.val);
            dfs(root.right, a);
        }
    }

}

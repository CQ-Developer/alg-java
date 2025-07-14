package org.huhu.leetcode.n222;

class SolutionD implements Solution {

    @Override
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int h = 0;
        for (var node = root.left; node != null; node = node.left) {
            h++;
        }
        int l = (1 << h), r = 1 << (h + 1);
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (check(root, 1 << (h - 1), mid) != null) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return l;
    }

    private TreeNode check(TreeNode root, int b, int k) {
        var node = root;
        while (node != null && b > 0) {
            if ((b & k) == 0) {
                node = node.left;
            } else {
                node = node.right;
            }
            b >>= 1;
        }
        return node;
    }

}

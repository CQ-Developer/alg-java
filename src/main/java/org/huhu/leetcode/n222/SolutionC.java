package org.huhu.leetcode.n222;

class SolutionC implements Solution {

    @Override
    public int countNodes(TreeNode root) {
        // 左侧高度
        int l = 0;
        var cur = root;
        while (cur != null) {
            l++;
            cur = cur.left;
        }
        // 右侧高度
        int r = 0;
        cur = root;
        while (cur != null) {
            r++;
            cur = cur.right;
        }
        // 完全二叉树
        if (l == r) {
            return (1 << l) - 1;
        }
        // 非完全二叉树
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

}

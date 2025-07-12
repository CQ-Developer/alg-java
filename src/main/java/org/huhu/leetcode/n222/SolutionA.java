package org.huhu.leetcode.n222;

class SolutionA implements Solution {

    @Override
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

}

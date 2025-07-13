package org.huhu.leetcode.n222;

import java.util.ArrayDeque;
import java.util.Queue;

class SolutionB implements Solution {

    @Override
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int cnt = 0;
        while (!q.isEmpty()) {
            cnt++;
            var cur = q.poll();
            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }
        }
        return cnt;
    }

}

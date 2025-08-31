package org.huhu.leetcode.n654;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionB implements Solution {

    @Override
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int n = nums.length;
        Deque<Integer> stack = new ArrayDeque<>();
        TreeNode[] nodes = new TreeNode[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new TreeNode(nums[i]);
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                nodes[i].left = nodes[stack.pop()];
            }
            if (!stack.isEmpty()) {
                nodes[stack.peek()].right = nodes[i];
            }
            stack.push(i);
        }
        return nodes[stack.peekLast()];
    }

}

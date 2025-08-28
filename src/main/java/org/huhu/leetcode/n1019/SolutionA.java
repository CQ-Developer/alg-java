package org.huhu.leetcode.n1019;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionA implements Solution {

    @Override
    public int[] nextLargerNodes(ListNode head) {
        int i = 0, n = 0;
        for (var node = head; node != null; node = node.next) {
            n++;
        }
        int[] result = new int[n];
        Deque<int[]> stack = new ArrayDeque<>();
        for (var node = head; node != null; node = node.next) {
            int val = node.val;
            while (!stack.isEmpty() && val > stack.peek()[0]) {
                result[stack.pop()[1]] = val;
            }
            stack.push(new int[] { val, i++ });
        }
        return result;
    }

}

package org.huhu.leetcode.n503;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionA implements Solution {

    @Override
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            int x = nums[i % n];
            while (!stack.isEmpty() && x >= stack.peek()) {
                stack.poll();
            }
            arr[i % n] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(x);
        }
        return arr;
    }

}

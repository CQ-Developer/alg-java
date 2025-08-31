package org.huhu.leetcode.n456;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionB implements Solution {

    @Override
    public boolean find132pattern(int[] nums) {
        int n = nums.length, k = Integer.MIN_VALUE;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(nums[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < k) {
                return true;
            }
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                k = stack.poll();
            }
            if (nums[i] > k) {
                stack.push(nums[i]);
            }
        }
        return false;
    }

}

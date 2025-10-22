package org.huhu.leetcode.n239;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionA implements Solution {

    @Override
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        for (int j = 0, i = 0; i < n; i++) {
            if (!deque.isEmpty() && deque.peekLast() < i - k + 1) {
                deque.pollLast();
            }
            while (!deque.isEmpty() && nums[i] > nums[deque.peek()]) {
                deque.pop();
            }
            deque.push(i);
            if (i >= k - 1) {
                ans[j++] = nums[deque.peekLast()];
            }
        }
        return ans;
    }

}

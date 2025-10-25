package org.huhu.leetcode.n3221;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionB implements Solution {

    @Override
    public long maxScore(int[] nums) {
        int n = nums.length;

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] >= nums[stack.peek()]) {
                stack.pop();
            }
            stack.push(i);
        }

        long ans = 0;

        int i = 0;
        for (int j : stack.reversed()) {
            ans += (j - i) * nums[j];
            i = j;
        }

        return ans;
    }

}

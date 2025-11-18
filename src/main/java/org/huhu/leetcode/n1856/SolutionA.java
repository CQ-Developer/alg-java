package org.huhu.leetcode.n1856;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionA implements Solution {

    @Override
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        // 前缀和
        long[] pre = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }
        // 单调栈
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        long max = 0;
        for (int r = 0; r <= n; r++) {
            int x = r < n ? nums[r] : -1;
            while (stack.size() > 1 && nums[stack.peek()] > x) {
                int i = stack.pop();
                int l = stack.peek();
                max = Math.max(max, nums[i] * (pre[r] - pre[l + 1]));
            }
            stack.push(r);
        }
        return (int) (max % 1000000007);
    }

}

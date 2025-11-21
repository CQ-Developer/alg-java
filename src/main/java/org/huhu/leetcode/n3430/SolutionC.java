package org.huhu.leetcode.n3430;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionC implements Solution {

    @Override
    public long minMaxSubarraySum(int[] nums, int k) {
        long a = contribute(nums, k);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = -nums[i];
        }
        return a - contribute(nums, k);
    }

    public long contribute(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        long ans = 0;
        for (int r = 0; r <= n; r++) {
            int v = r < n ? nums[r] : Integer.MIN_VALUE;
            while (stack.size() > 1 && nums[stack.peek()] >= v) {
                int i = stack.pop();
                int l = stack.peek();
                ans +=  nums[i] * (count(r - l - 1, k) - count(i - l - 1, k) - count(r - i - 1, k));
            }
            stack.push(r);
        }
        return ans;
    }

    private long count(long n, long k) {
        if (n <= k) {
            return n * (n + 1) / 2;
        }
        return (n + n - k + 1) * k / 2;
    }

}

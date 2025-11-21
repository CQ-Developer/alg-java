package org.huhu.leetcode.n3430;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionB implements Solution {

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
                if (r - l - 1 <= k) {
                    ans += (long) nums[i] * (i - l) * (r - i);
                } else {
                    int p = Math.max(l, i - k);
                    int q = Math.min(r, i + k);
                    int a = (q - i) * (i - (q - k));
                    int b = (p + q + k + 1 - i * 2) * (q - p - k) / 2;
                    ans += (long) nums[i] * (a + b);
                }
            }
            stack.push(r);
        }
        return ans;
    }

}

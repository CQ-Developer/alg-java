package org.huhu.leetcode.n3430;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionA implements Solution {

    @Override
    public long minMaxSubarraySum(int[] nums, int k) {
        long a = contribute(nums, k);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = -nums[i];
        }
        long b = contribute(nums, k);
        return a - b;
    }

    private long contribute(int[] nums, int k) {
        int n = nums.length;
        int[] left = new int[n], right = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        for (int i = 0; i < n; i++) {
            right[i] = n;
            while (stack.size() > 1 && nums[stack.peek()] >= nums[i]) {
                right[stack.pop()] = i;
            }
            left[i] = stack.peek();
            stack.push(i);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int l = left[i], r = right[i];
            if (r - l - 1 <= k) {
                ans += (long) nums[i] * (i - l) * (r - i);
            } else {
                l = Math.max(l, i - k);
                r = Math.min(r, i + k);
                int a = (r - i) * (i - (r - k));
                int b = (l + r + k + 1 - i * 2) * (r - l - k) / 2;
                ans += (long) nums[i] * (a + b);
            }
        }
        return ans;
    }

}

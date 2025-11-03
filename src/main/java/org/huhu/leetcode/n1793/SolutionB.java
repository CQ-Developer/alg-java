package org.huhu.leetcode.n1793;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionB implements Solution {

    @Override
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> stk = new ArrayDeque<>();
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = -1;
            while (!stk.isEmpty() && nums[i] <= nums[stk.peek()]) {
                stk.pop();
            }
            if (!stk.isEmpty()) {
                left[i] = stk.peek();
            }
            stk.push(i);
        }
        stk.clear();
        int[] right = new int[n];
        for (int i = n - 1; i > -1; i--) {
            right[i] = n;
            while (!stk.isEmpty() && nums[i] <= nums[stk.peek()]) {
                stk.pop();
            }
            if (!stk.isEmpty()) {
                right[i] = stk.peek();
            }
            stk.push(i);
        }
        int mx = 0;
        for (int i = 0; i < n; i++) {
            int l = left[i], r = right[i];
            if (l < k && k < r) {
                mx = Math.max(mx, nums[i] * (r - l - 1));
            }
        }
        return mx;
    }

}

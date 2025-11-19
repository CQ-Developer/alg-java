package org.huhu.leetcode.n2818;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

class SolutionA implements Solution {

    private static final int[] omega = new int[100000 + 1];

    static {
        for (int i = 2; i <= 100000; i++) {
            if (omega[i] == 0) {
                for (int j = i; j <= 100000; j += i) {
                    omega[j]++;
                }
            }
        }
    }

    @Override
    public int maximumScore(List<Integer> _nums, int k) {
        Integer[] nums = _nums.toArray(Integer[]::new);
        int n = nums.length;
        int[] left = new int[n], right = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        for (int i = 0; i < n; i++) {
            right[i] = n;
            while (stack.size() > 1 && omega[nums[stack.peek()]] < omega[nums[i]]) {
                right[stack.pop()] = i;
            }
            left[i] = stack.peek();
            stack.push(i);
        }
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, (i, j) -> nums[j] - nums[i]);
        long ans = 1;
        for (int i : idx) {
            long total = (long) (i - left[i]) * (right[i] - i);
            if (total >= k) {
                ans = ans * pow(nums[i], k) % 1000000007;
                break;
            }
            ans = ans * pow(nums[i], (int) total) % 1000000007;
            k -= total;
        }
        return (int) ans;
    }

    private long pow(long x, int n) {
        long ans = 1;
        for (; n > 0; n /= 2) {
            if ((n & 1) == 1) {
                ans = ans * x % 1000000007;
            }
            x = x * x % 1000000007;
        }
        return ans;
    }

}

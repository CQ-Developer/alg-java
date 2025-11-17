package org.huhu.leetcode.n2104;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionB implements Solution {

    @Override
    public long subArrayRanges(int[] nums) {
        long a = sum(nums);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = -nums[i];
        }
        return a + sum(nums);
    }

    private long sum(int[] nums) {
        int n = nums.length;
        int[] left = new int[n], right = new int[n];
        Deque<Integer> stk = new ArrayDeque<>();
        stk.push(-1);
        for (int i = 0; i < n; i++) {
            right[i] = n;
            while (stk.size() > 1 && nums[stk.peek()] <= nums[i]) {
                right[stk.pop()] = i;
            }
            left[i] = stk.peek();
            stk.push(i);
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (long) nums[i] * (i - left[i]) * (right[i] - i);
        }
        return sum;
    }

}

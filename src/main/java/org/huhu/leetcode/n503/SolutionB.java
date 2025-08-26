package org.huhu.leetcode.n503;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class SolutionB implements Solution {

    @Override
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = 0; i < 2 * n; i++) {
            int x = nums[i % n];
            while (!stk.isEmpty() && x > nums[stk.peek()]) {
                res[stk.pop()] = x;
            }
            if (i < n) {
                stk.push(i);
            }
        }
        return res;
    }

}

package org.huhu.leetcode.n3113;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionA implements Solution {

    @Override
    public long numberOfSubarrays(int[] nums) {
        int cnt = nums.length;
        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[] { Integer.MAX_VALUE, 0 });
        for (int num : nums) {
            while (num > stack.peek()[0]) {
                stack.pop();
            }
            if (num == stack.peek()[0]) {
                cnt += stack.peek()[1]++;
            } else {
                stack.push(new int[] { num, 1 });
            }
        }
        return cnt;
    }

}

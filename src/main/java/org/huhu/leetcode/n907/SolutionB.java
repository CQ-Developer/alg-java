package org.huhu.leetcode.n907;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionB implements Solution {

    @Override
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Deque<Integer> stk = new ArrayDeque<>();
        stk.push(-1);
        for (int i = 0; i < n; i++) {
            right[i] = n;
            while (stk.size() > 1 && arr[stk.peek()] >= arr[i]) {
                right[stk.pop()] = i;
            }
            left[i] = stk.peek();
            stk.push(i);
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (long) arr[i] * (i - left[i]) * (right[i] - i);
        }
        return (int) (sum % 1000000007);
    }

}

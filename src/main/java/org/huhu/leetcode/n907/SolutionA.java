package org.huhu.leetcode.n907;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionA implements Solution {

    @Override
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        // left
        Deque<Integer> stk = new ArrayDeque<>();
        stk.push(-1);
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            while (stk.size() > 1 && arr[stk.peek()] >= arr[i]) {
                stk.pop();
            }
            left[i] = stk.peek();
            stk.push(i);
        }
        // right
        stk.clear();
        stk.push(n);
        int[] right = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (stk.size() > 1 && arr[stk.peek()] > arr[i]) {
                stk.pop();
            }
            right[i] = stk.peek();
            stk.push(i);
        }
        // sum
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (long) arr[i] * (i - left[i]) * (right[i] - i);
        }
        return (int) (sum % 1000000007);
    }

}

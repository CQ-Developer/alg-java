package org.huhu.leetcode.n907;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionC implements Solution {

    @Override
    public int sumSubarrayMins(int[] arr) {
        long sum = 0;
        int n = arr.length;
        Deque<Integer> stk = new ArrayDeque<>();
        stk.push(-1);
        for (int r = 0; r <= n; r++) {
            int x = r < n ? arr[r] : -1;
            while (stk.size() > 1 && arr[stk.peek()] >= x) {
                int i = stk.pop();
                sum += (long) arr[i] * (i - stk.peek()) * (r - i);
            }
            stk.push(r);
        }
        return (int) (sum % 1000000007);
    }

}

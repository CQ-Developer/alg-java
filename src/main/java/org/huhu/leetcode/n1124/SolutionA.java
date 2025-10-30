package org.huhu.leetcode.n1124;

class SolutionA implements Solution {

    @Override
    public int longestWPI(int[] hours) {
        int n = hours.length;
        int[] preSum = new int[n + 1];
        int k = 0;
        int[] stack = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            preSum[i] = preSum[i - 1] + (hours[i - 1] > 8 ? 1 : -1);
            if (preSum[i] < preSum[stack[k]]) {
                stack[++k] = i;
            }
        }
        int ans = 0;
        for (int i = n; i > 0; i--) {
            while (k > -1 && preSum[i] > preSum[stack[k]]) {
                ans = Math.max(ans, i - stack[k--]);
            }
        }
        return ans;
    }

}

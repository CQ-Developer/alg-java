package org.huhu.leetcode.n907;

class SolutionD implements Solution {

    @Override
    public int sumSubarrayMins(int[] arr) {
        long sum = 0;
        int n = arr.length;
        int k = 0;
        int[] stk = new int[n + 1];
        stk[0] = -1;
        for (int r = 0; r <= n; r++) {
            int x = r < n ? arr[r] : -1;
            while (k > 0 && arr[stk[k]] >= x) {
                int i = stk[k--];
                sum += (long) arr[i] * (i - stk[k]) * (r - i);
            }
            stk[++k] = r;
        }

        return (int) (sum % 1000000007);
    }

}

package org.huhu.leetcode.n1310;

class SolutionA implements Solution {

    @Override
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] ^ arr[i];
        }
        n = queries.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pre[queries[i][1] + 1] ^ pre[queries[i][0]];
        }
        return ans;
    }

}

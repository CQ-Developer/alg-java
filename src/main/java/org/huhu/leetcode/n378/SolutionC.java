package org.huhu.leetcode.n378;

class SolutionC implements Solution {

    @Override
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int l = matrix[0][0], r = matrix[n - 1][n - 1];
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (check(matrix, n, k, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean check(int[][] matrix, int n, int k, int top) {
        int cnt = 0;
        for (int i = n - 1, j = 0; i >= 0 && j < n;) {
            if (matrix[i][j] <= top) {
                // 当前行的上方所有格子的数量加入结果
                cnt += i + 1;
                j++;
            } else {
                i--;
            }
        }
        return cnt >= k;
    }

}

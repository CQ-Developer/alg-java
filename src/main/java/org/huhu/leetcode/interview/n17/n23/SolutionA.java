package org.huhu.leetcode.interview.n17.n23;

class SolutionA implements Solution {

    @Override
    public int[] findSquare(int[][] matrix) {
        int n = matrix.length;
        int[][] left = new int[n + 1][n + 1], up = new int[n + 1][n + 1];
        int r = 0, c = 0, size = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == 0) {
                    left[i][j] = left[i][j - 1] + 1;
                    up[i][j] = up[i - 1][j] + 1;
                    int k = Math.min(left[i][j], up[i][j]);
                    while (left[i - k + 1][j] < k || up[i][j - k + 1] < k) {
                        k--;
                    }
                    if (k > size) {
                        r = i - k;
                        c = j - k;
                        size = k;
                    }
                }
            }
        }
        if (size == 0) {
            return new int[0];
        }
        return new int[] { r, c, size };
    }

}

package org.huhu.leetcode.n1901;

class SolutionA implements Solution {

    @Override
    public int[] findPeakGrid(int[][] mat) {
        int l = -1, r = mat.length - 1;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            int j = max(mat[i]);
            if (mat[i][j] > mat[i + 1][j]) {
                r = i;
            } else {
                l = i;
            }
        }
        return new int[] { r, max(mat[r]) };
    }

    private int max(int[] row) {
        int i = 0;
        for (int j = 1; j < row.length; j++) {
            if (row[j] > row[i]) {
                i = j;
            }
        }
        return i;
    }

}

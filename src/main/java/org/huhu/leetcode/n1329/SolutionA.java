package org.huhu.leetcode.n1329;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] arr = new int[Math.min(m, n)];
        for (int k = 1; k < m + n; k++) {
            int mn = Math.max(n - k, 0), mx = Math.min(m + n - 1 - k, n - 1);
            for (int j = mn; j <= mx; j++) {
                int i = k + j - n;
                arr[j - mn] = mat[i][j];
            }
            Arrays.sort(arr, 0, mx - mn + 1);
            for (int j = mn; j <= mx; j++) {
                int i = k + j - n;
                mat[i][j] = arr[j - mn];
            }
        }
        return mat;
    }

}

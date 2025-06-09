package org.huhu.leetcode.n378;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] arr = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i * n + j] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }

}

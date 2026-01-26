package org.huhu.leetcode.n3446;

import java.util.Arrays;

class SolutionB implements Solution {

    @Override
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int[] arr = new int[n + n];
        for (int k = 1; k < n + n; k++) {
            int mn = Math.max(n - k, 0), mx = Math.min(n + n - k - 1, n - 1);
            int len = 0;
            for (int j = mn; j <= mx; j++) {
                int x = grid[k + j - n][j];
                arr[len++] = k < n ? x : -x;
            }
            Arrays.sort(arr, 0, len);
            for (int j = mn; j <= mx; j++) {
                int x = arr[j - mn];
                grid[k + j - n][j] = k < n ? x : -x;
            }
        }
        return grid;
    }

}

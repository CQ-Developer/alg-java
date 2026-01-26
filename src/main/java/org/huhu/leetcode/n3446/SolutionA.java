package org.huhu.leetcode.n3446;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        // 左下角
        int[] arr = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            int m = 0;
            for (int y = 0, x = i; x < n; x++, y++) {
                arr[m++] = -grid[x][y];
            }
            Arrays.sort(arr, 0, m);
            for (int j = 0, y = 0, x = i; x < n; j++, x++, y++) {
                grid[x][y] = -arr[j];
            }
        }
        // 右上角
        for (int j = n - 2; j > 0; j--) {
            int m = 0;
            for (int x = 0, y = j; y < n; x++, y++) {
                arr[m++] = grid[x][y];
            }
            Arrays.sort(arr, 0, m);
            for (int i = 0, x = 0, y = j; y < n; i++, x++, y++) {
                grid[x][y] = arr[i];
            }
        }
        return grid;
    }

}

package org.huhu.leetcode.n221;

class SolutionB implements Solution {

    @Override
    public int maximalSquare(char[][] matrix) {
        int h = matrix.length, w = matrix[0].length, side = 0;
        int[][] f = new int[h + 1][w + 1];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (matrix[i][j] == '1') {
                    f[i + 1][j + 1] = Math.min(Math.min(f[i + 1][j], f[i][j + 1]), f[i][j]) + 1;
                    side = Math.max(side, f[i + 1][j + 1]);
                }
            }
        }
        return side * side;
    }

}

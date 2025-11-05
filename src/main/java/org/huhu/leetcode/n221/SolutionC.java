package org.huhu.leetcode.n221;

class SolutionC implements Solution {

    @Override
    public int maximalSquare(char[][] matrix) {
        int w = matrix[0].length, side = 0;
        int[] f = new int[w + 1];
        for (char[] row : matrix) {
            int pre = 0;
            for (int j = 0; j < w; j++) {
                if (row[j] == '1') {
                    int cur = f[j + 1];
                    f[j + 1] = Math.min(Math.min(f[j], f[j + 1]), pre) + 1;
                    side = Math.max(side, f[j + 1]);
                    pre = cur;
                } else {
                    f[j + 1] = 0;
                    pre = 0;
                }
            }
        }
        return side * side;
    }

}

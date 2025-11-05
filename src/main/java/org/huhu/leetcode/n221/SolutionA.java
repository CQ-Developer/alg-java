package org.huhu.leetcode.n221;

class SolutionA implements Solution {

    @Override
    public int maximalSquare(char[][] matrix) {
        int side = 0, n = matrix[0].length;
        int[] heights = new int[n];
        for (char[] row : matrix) {
            for (int i = 0; i < n; i++) {
                if (row[i] == '1') {
                    heights[i]++;
                } else {
                    heights[i] = 0;
                }
            }
            side = Math.max(side, find(heights));
        }
        return side * side;
    }

    private int find(int[] heights) {
        int side = 0, n = heights.length;
        for (int i = 0; i < n; i++) {
            int h = heights[i];
            int l = i - 1;
            while (l >= 0 && heights[l] >= h) {
                l--;
            }
            int r = i + 1;
            while (r < n && heights[r] >= h) {
                r++;
            }
            side = Math.max(side, Math.min(h, r - l - 1));
        }
        return side;
    }

}

package org.huhu.leetcode.n85;

class SolutionA implements Solution {

    @Override
    public int maximalRectangle(char[][] matrix) {
        int mx = 0;
        int n = matrix[0].length;
        int[] heights = new int[n];
        for (char[] row : matrix) {
            for (int j = 0; j < n; j++) {
                if (row[j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            mx = Math.max(mx, largestArea(heights));
        }
        return mx;
    }

    private int largestArea(int[] heights) {
        int mx = 0, n = heights.length;
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
            mx = Math.max(mx, h * (r - l - 1));
        }
        return mx;
    }

}

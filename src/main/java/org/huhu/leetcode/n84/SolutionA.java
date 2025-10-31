package org.huhu.leetcode.n84;

/**
 * 暴力做法，超时无法通过测试
 */
class SolutionA implements Solution {

    @Override
    public int largestRectangleArea(int[] heights) {
        int mx = 0, n = heights.length;
        for (int r = 0; r < n; r++) {
            int h = heights[r];
            for (int l = r; l > -1; l--) {
                h = Math.min(h, heights[l]);
                mx = Math.max(mx, h * (r - l + 1));
            }
        }
        return mx;
    }

}

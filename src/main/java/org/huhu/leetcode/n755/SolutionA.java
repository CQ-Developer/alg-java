package org.huhu.leetcode.n755;

class SolutionA implements Solution {

    static final int[] D = { -1, 1 };

    @Override
    public int[] pourWater(int[] heights, int volume, int k) {
        int n = heights.length;
        for (int v = 0; v < volume; v++) {
            boolean find = false;
            for (int d : D) {
                int j = k;
                for (int i = k; 0 <= i + d && i + d < n && heights[i + d] <= heights[i]; i += d) {
                    if (heights[i + d] < heights[i]) {
                        j = i + d;
                    }
                }
                if (j != k) {
                    heights[j]++;
                    find = true;
                    break;
                }
            }
            if (!find) {
                heights[k]++;
            }
        }
        return heights;
    }

}

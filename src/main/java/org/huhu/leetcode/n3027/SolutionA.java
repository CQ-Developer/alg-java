package org.huhu.leetcode.n3027;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int numberOfPairs(int[][] points) {
        int cnt = 0;
        int n = points.length;
        Arrays.sort(points, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            int y1 = points[i][1];
            int maxY = Integer.MIN_VALUE;
            for (int j = i + 1; j < n && maxY < y1; j++) {
                int y2 = points[j][1];
                if (y2 <= y1 && y2 > maxY) {
                    maxY = y2;
                    cnt++;
                }
            }
        }
        return cnt;
    }

}

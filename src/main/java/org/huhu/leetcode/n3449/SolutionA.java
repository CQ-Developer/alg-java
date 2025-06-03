package org.huhu.leetcode.n3449;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public long maxScore(int[] points, int m) {
        long l = 0, r = 0;
        for (int point : points) {
            r += point;
        }
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (check(points, m, mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }

    private boolean check(int[] points, int m, long min) {
        int n = points.length;
        int[] scores = new int[n];
        scores[0] = points[0];
        for (int i = 0, cnt = 1; cnt < m; cnt++) {
            if (i > 0 && scores[i - 1] < min || i == n - 1) {
                i--;
            } else {
                i++;
            }
            scores[i] += points[i];
        }
        // 超时
        Arrays.sort(scores);
        return scores[0] >= min;
    }

}

package org.huhu.leetcode.n3449;

class SolutionA implements Solution {

    @Override
    public long maxScore(int[] points, int m) {
        int n = points.length, mn = points[0];
        for (int i = 1; i < n; i++) {
            mn = Math.min(mn, points[i]);
        }
        long l = 0, r = (m + 1) / 2L * mn + 1;
        while (l + 1 < r) {
            long mid = l + (r - l) / 2;
            if (check(points, n, m, mid)) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return l;
    }

    private boolean check(int[] points, int n, int m, long low) {
        int rest = m;
        for (int pre = 0, i = 0; i < n; i++) {
            int k = (int) ((low - 1) / points[i] + 1) - pre;
            if (i == n - 1 && k <= 0) {
                break;
            }
            k = Math.max(k, 1);
            rest -= 2 * k - 1;
            if (rest < 0) {
                return false;
            }
            pre = k - 1;
        }
        return true;
    }

}

package org.huhu.leetcode.lcp.n12;

class SolutionA implements Solution {

    @Override
    public int minTime(int[] time, int m) {
        int l = -1, r = 0;
        for (int t : time) {
            r += t;
        }
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (check(time, m, mid)) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return r;
    }

    private boolean check(int[] time, int m, int mx) {
        int p = 0, s = 0;
        for (int t : time) {
            if (s + t - Math.max(p, t) <= mx) {
                s += t;
                p = Math.max(p, t);
            } else {
                s = p = t;
                m--;
            }
        }
        return m - 1 >= 0;
    }

}

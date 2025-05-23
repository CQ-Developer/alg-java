package org.huhu.leetcode.n3281;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int maxPossibleScore(int[] start, int d) {
        Arrays.sort(start);
        int n = start.length;
        long l = 0, r = start[n - 1] + d - start[0];
        while (l <= r) {
            long m = l + (r - l) / 2;
            if (check(start, d, m)) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return (int) r;
    }

    private boolean check(int[] start, int d, long m) {
        long p = -m;
        for (int s : start) {
            if (p + m > s + d) {
                return false;
            }
            p = p + m <= s ? s : p + m;
        }
        return true;
    }

}

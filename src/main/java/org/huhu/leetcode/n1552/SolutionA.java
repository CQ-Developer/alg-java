package org.huhu.leetcode.n1552;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int l = 0, r = position[n - 1] - position[0];
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (check(position, m, mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }

    private boolean check(int[] position, int m, int mn) {
        int pre = -mn;
        for (int p : position) {
            if (p - pre >= mn) {
                pre = p;
                m--;
            }
        }
        return m <= 0;
    }

}

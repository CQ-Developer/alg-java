package org.huhu.leetcode.n278;

class SolutionA extends Solution {

    @Override
    public int firstBadVersion(int n) {
        int l = 1, r = n;
        while (l <= r) {
            int v = l + (r - l) / 2;
            if (isBadVersion(v)) {
                r = v - 1;
            } else {
                l = v + 1;
            }
        }
        return l;
    }

}

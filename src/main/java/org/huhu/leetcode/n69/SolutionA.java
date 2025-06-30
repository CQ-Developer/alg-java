package org.huhu.leetcode.n69;

class SolutionA implements Solution {

    @Override
    public int mySqrt(int x) {
        int l = 0, r = (x - 1) / 2 + 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }

}

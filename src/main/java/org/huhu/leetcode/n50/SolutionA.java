package org.huhu.leetcode.n50;

class SolutionA implements Solution {

    @Override
    public double myPow(double x, int N) {
        long n = N;
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        double p = 1;
        for (; n > 0; n /= 2) {
            if ((n & 1) == 1) {
                p *= x;
            }
            x *= x;
        }
        return p;
    }

}

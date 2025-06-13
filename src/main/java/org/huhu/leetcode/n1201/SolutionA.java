package org.huhu.leetcode.n1201;

class SolutionA implements Solution {

    @Override
    public int nthUglyNumber(int n, int a, int b, int c) {
        long ab = a / gcd(a, b) * b, bc = b / gcd(b, c) * c, ca = c / gcd(c, a) * a, abc = ab * c / gcd(ab, c);
        long min = Math.min(a, Math.min(b, c));
        long l = min, r = min * n;
        while (l < r) {
            long m = l + (r - l) / 2;
            if (m / a + m / b + m / c - m / ab - m / bc - m / ca + m / abc >= n) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return (int) r;
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}

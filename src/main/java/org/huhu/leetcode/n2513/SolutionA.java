package org.huhu.leetcode.n2513;

class SolutionA implements Solution {

    @Override
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        long lcm = lcm(divisor1, divisor2);
        long l = 0, r = (uniqueCnt1 + uniqueCnt2) * 2L - 1;
        while (l < r) {
            long m = l + (r - l) / 2;
            if (check(divisor1, divisor2, uniqueCnt1, uniqueCnt2, lcm, m)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return (int) r;
    }

    public boolean check(int d1, int d2, int u1, int u2, long lcm, long x) {
        long a = Math.max(0, u1 - x / d2 + x / lcm);
        long b = Math.max(0, u2 - x / d1 + x / lcm);
        long c = x - x / d1 - x / d2 + x / lcm;
        return c >= a + b;
    }

    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}

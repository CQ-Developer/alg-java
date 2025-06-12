package org.huhu.leetcode.n878;

class SolutionA implements Solution {

    @Override
    public int nthMagicalNumber(int n, int a, int b) {
        long lcm = a * b / gcd(a, b);
        long l = 1, r = 1L * Math.min(a, b) * n;
        while (l + 1 < r) {
            long mid = l + (r - l) / 2;
            if (mid / a + mid / b - mid / lcm >= n) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return (int) (r % 1_000_000_007);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}

package org.huhu.leetcode.n3116;

class SolutionB implements Solution {

    @Override
    public long findKthSmallest(int[] coins, int k) {
        int n = coins.length;
        long[] subset = new long[1 << n];
        subset[0] = 1;
        for (int i = 0; i < n; i++) {
            int status = 1 << i;
            for (int mask = 0; mask < status; mask++) {
                subset[status | mask] = lcm(subset[mask], coins[i]);
            }
        }
        for (int s = 1; s < (1 << n); s++) {
            if ((Integer.bitCount(s) & 1) == 0) {
                subset[s] *= -1;
            }
        }
        int mn = Integer.MAX_VALUE;
        for (int x : coins) {
            mn = Math.min(x, mn);
        }
        long l = k - 1, r = (long) mn * k;
        while (l + 1 < r) {
            long mid = l + (r - l) / 2;
            if (check(subset, mid) >= k) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return r;
    }

    private long check(long[] subset, long x) {
        long cnt = 0;
        for (int s = 1; s < subset.length; s++) {
            cnt += x / subset[s];
        }
        return cnt;
    }

    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}

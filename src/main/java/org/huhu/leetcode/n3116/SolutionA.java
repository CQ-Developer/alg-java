package org.huhu.leetcode.n3116;

class SolutionA implements Solution {

    @Override
    public long findKthSmallest(int[] coins, int k) {
        int mn = Integer.MAX_VALUE;
        for (int x : coins) {
            mn = Math.min(x, mn);
        }
        int n = coins.length;
        long l = k - 1, r = (long) mn * k;
        while (l + 1 < r) {
            long mid = l + (r - l) / 2;
            if (check(coins, n, mid) >= k) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return r;
    }

    private long check(int[] coins, int n, long x) {
        long cnt = 0;
        // 枚举所有非空子集
        next: for (int s = 1; s < (1 << n); s++) {
            // 计算子集的最小公倍数
            long lcm = 1;
            for (int i = 0; i < n; i++) {
                if ((1 << i & s) != 0) {
                    lcm = lcm(lcm, coins[i]);
                    if (lcm > x) {
                        continue next;
                    }
                }
            }
            cnt += (Integer.bitCount(s) & 1) == 1 ? x / lcm : -x / lcm;
        }
        return cnt;
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}

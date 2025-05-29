package org.huhu.leetcode.n2528;

class SolutionA implements Solution {

    @Override
    public long maxPower(int[] stations, int r, int k) {
        int n = stations.length;
        // 前缀和
        long[] pre = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + stations[i];
        }
        // 计算每个城市的电量和最小值
        long mn = Long.MAX_VALUE;
        long[] powers = new long[n];
        for (int i = 0; i < n; i++) {
            powers[i] = pre[Math.min(n, i + r + 1)] - pre[Math.max(0, i - r)];
            mn = Math.min(mn, powers[i]);
        }
        // 二分
        long left = mn, right = mn + k + 1;
        while (left + 1 < right) {
            long mid = left + (right - left) / 2;
            if (check(powers, n, r, k, mid)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private boolean check(long[] powers, int n, int r, int k, long minPower) {
        // 差分数组
        long difSum = 0, need = 0;
        long[] dif = new long[n + 1];
        for (int i = 0; i < n; i++) {
            difSum += dif[i];
            long m = minPower - powers[i] - difSum;
            if (m > 0) {
                need += m;
                if (need > k) {
                    return false;
                }
                difSum += m;
                if (i + 2 * r + 1 < n) {
                    dif[i + 2 * r + 1] -= m;
                }
            }
        }
        return true;
    }

}

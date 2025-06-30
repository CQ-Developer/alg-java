package org.huhu.leetcode.n1508;

class SolutionB implements Solution {

    @Override
    public int rangeSum(int[] nums, int n, int left, int right) {
        long[] p = new long[n + 1], pp = new long[n + 1];
        for (int i = 0; i < n; i++) {
            p[i + 1] = p[i] + nums[i];
            pp[i + 1] = pp[i] + p[i + 1];
        }
        return (int) ((f(right, p, pp, n) - f(left - 1, p, pp, n)) % 1000000007);
    }

    private long f(int k, long[] p, long[] pp, int n) {
        long x = getKth(k, p, pp, n);
        long[] a = getSumCnt(x, p, pp, n);
        return a[0] + (k - a[1]) * x;
    }

    /**
     * (l...r]
     */
    private long getKth(int k, long[] p, long[] pp, int n) {
        long l = 0, r = p[n];
        while (l < r) {
            long mid  = l + (r - l + 1) / 2;
            long[] a = getSumCnt(mid, p, pp, n);
            if (a[1] >= k) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        return l;
    }

    private long[] getSumCnt(long x, long[] p, long[] pp, int n) {
        long sum = 0, cnt = 0;
        for (int j = 0, i = 0; i < n; i++) {
            while (j < n && p[j + 1] - p[i] < x) {
                j++;
            }
            sum += pp[j] - pp[i] - (j - i) * p[i];
            cnt += j - i;
        }
        return new long[] { sum, cnt };
    }

}

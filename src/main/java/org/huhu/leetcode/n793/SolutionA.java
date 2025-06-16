package org.huhu.leetcode.n793;

class SolutionA implements Solution {

    @Override
    public int preimageSizeFZF(int k) {
        long l = 0L, r = 5L * k;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long num = check(mid);
            if (num == k) {
                return 5;
            }
            if (num < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return 0;
    }

    private long check(long x) {
        long n = 5, nums = 0;
        while (n <= x) {
            nums += x / n;
            n *= 5;
        }
        return nums;
    }

}

package org.huhu.leetcode.n668;

class SolutionA implements Solution {

    @Override
    public int findKthNumber(int m, int n, int k) {
        int l = 0, r = m * n;
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (check(m, n, k, mid)) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return r;
    }

    private boolean check(int m, int n, int k, int x) {
        int cnt = 0;
        for (int i = 1; i <= m; i++) {
            cnt += Math.min(x / i, n);
        }
        return cnt >= k;
    }

}

package org.huhu.leetcode.n3399;

class SolutionA implements Solution {

    @Override
    public int minLength(String s, int numOps) {
        char[] _s = s.toCharArray();
        int l = 0, r = _s.length;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (check(_s, numOps, m)) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

    private boolean check(char[] s, int ops, int m) {
        int n = s.length, cnt = 0;
        if (m == 1) {
            for (int i = 0; i < n; i++) {
                cnt += (s[i] ^ i) & 1;
            }
            cnt = Math.min(cnt, n - cnt);
        } else {
            for (int len = 0, i = 0; i < n; i++) {
                len++;
                if (i == n - 1 || s[i] != s[i + 1]) {
                    cnt += len / (m + 1);
                    len = 0;
                }
            }
        }
        return cnt <= ops;
    }

}

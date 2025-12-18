package org.huhu.leetcode.n1446;

class SolutionA implements Solution {

    @Override
    public int maxPower(String s) {
        int mx = 0, n = s.length();
        for (int l = 0; l < n;) {
            int r = l;
            while (r < n && s.charAt(r) == s.charAt(l)) {
                r++;
            }
            mx = Math.max(mx, r - l);
            l = r;
        }
        return mx;
    }

}

package org.huhu.leetcode.n1446;

class SolutionA implements Solution {

    @Override
    public int maxPower(String s) {
        int mx = 0, n = s.length();
        for (int r = 0, l = 0; l < n; l = r) {
            while (r < n && s.charAt(r) == s.charAt(l)) {
                r++;
            }
            mx = Math.max(mx, r - l);
        }
        return mx;
    }

}

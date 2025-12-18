package org.huhu.leetcode.n3713;

class SolutionB implements Solution {

    @Override
    public int longestBalanced(String s) {
        int n = s.length(), longest = 0;
        for (int l = 0; l < n; l++) {
            int mx = 0, k = 0;
            int[] cnt = new int[27];
            for (int r = l; r < n; r++) {
                int i = s.charAt(r) & 0x1f;
                if (cnt[i] == 0) {
                    k++;
                }
                mx = Math.max(mx, ++cnt[i]);
                if (mx * k == r - l + 1) {
                    longest = Math.max(longest, r - l + 1);
                }
            }
        }
        return longest;
    }

}

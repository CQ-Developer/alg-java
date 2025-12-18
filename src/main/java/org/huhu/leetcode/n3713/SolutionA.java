package org.huhu.leetcode.n3713;

class SolutionA implements Solution {

    @Override
    public int longestBalanced(String s) {
        int n = s.length(), longest = 0;
        for (int l = 0; l < n; l++) {
            int[] cnt = new int[27];
            to: for (int r = l; r < n; r++) {
                int base = ++cnt[s.charAt(r) & 0x1f];
                for (int c : cnt) {
                    if (c > 0 && c != base) {
                        continue to;
                    }
                }
                longest = Math.max(longest, r - l + 1);
            }
        }
        return longest;
    }

}

package org.huhu.leetcode.n1081;

class SolutionA implements Solution {

    @Override
    public String smallestSubsequence(String s) {
        char[] chars = s.toCharArray();

        int[] remaining = new int['z' + 1], inside = new int['z' + 1];
        for (char c : chars) {
            remaining[c]++;
        }

        int n = 0;
        char[] st = new char[chars.length];

        for (char c : chars) {
            remaining[c]--;
            if (inside[c] > 0) {
                continue;
            }
            while (n > 0 && c < st[n - 1] && remaining[st[n - 1]] > 0) {
                inside[st[--n]]--;
            }
            st[n++] = c;
            inside[c]++;
        }

        return String.valueOf(st, 0, n);
    }

}

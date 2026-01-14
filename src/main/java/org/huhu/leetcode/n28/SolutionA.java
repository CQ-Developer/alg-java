package org.huhu.leetcode.n28;

class SolutionA implements Solution {

    @Override
    public int strStr(String haystack, String needle) {
        char[] s1 = haystack.toCharArray(), s2 = needle.toCharArray();
        int m = s1.length, n = s2.length;

        int cnt = 0;
        int[] pi = new int[n];
        for (int i = 1; i < n; i++) {
            while (cnt > 0 && s2[cnt] != s2[i]) {
                cnt = pi[cnt - 1];
            }
            if (s2[cnt] == s2[i]) {
                cnt++;
            }
            pi[i] = cnt;
        }

        cnt = 0;
        for (int i = 0; i < m; i++) {
            while (cnt > 0 && s2[cnt] != s1[i]) {
                cnt = pi[cnt - 1];
            }
            if (s2[cnt] == s1[i]) {
                cnt++;
            }
            if (cnt == n) {
                return i - n + 1;
            }
        }

        return -1;
    }

}

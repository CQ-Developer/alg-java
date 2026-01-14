package org.huhu.leetcode.n3455;

import java.util.ArrayList;
import java.util.List;

class SolutionA implements Solution {

    @Override
    public int shortestMatchingSubstring(String s, String p) {
        char[] text = s.toCharArray();
        int m = text.length;

        String[] sp = p.split("\\*", -1);
        char[] p1 = sp[0].toCharArray();
        int n1 = p1.length;
        char[] p2 = sp[1].toCharArray();
        int n2 = p2.length;
        char[] p3 = sp[2].toCharArray();
        int n3 = p3.length;

        // kmp
        List<Integer> pos1 = kmp(text, m, p1, n1);
        List<Integer> pos2 = kmp(text, m, p2, n2);
        List<Integer> pos3 = kmp(text, m, p3, n3);

        // 3 pointers
        int ans = Integer.MAX_VALUE;
        int i = 0, k = 0;
        for (int j : pos2) {
            // 右边最近
            while (k < pos3.size() && pos3.get(k) < j + n2) {
                k++;
            }
            if (k == pos3.size()) {
                break;
            }
            // 左边最近
            while (i < pos1.size() && pos1.get(i) <= j - n1) {
                i++;
            }
            if (i > 0) {
                ans = Math.min(ans, pos3.get(k) + n3 - pos1.get(i - 1));
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private List<Integer> kmp(char[] s, int m, char[] p, int n) {
        // 特殊处理
        if (n == 0) {
            List<Integer> pos = new ArrayList<>(m + 1);
            for (int i = 0; i <= m; i++) {
                pos.add(i);
            }
            return pos;
        }
        // kmp
        int len = 0;
        int[] pi = new int[n];
        for (int i = 1; i < n; i++) {
            while (len > 0 && p[len] != p[i]) {
                len = pi[len - 1];
            }
            if (p[len] == p[i]) {
                len++;
            }
            pi[i] = len;
        }
        len = 0;
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            while (len > 0 && p[len] != s[i]) {
                len = pi[len - 1];
            }
            if (p[len] == s[i]) {
                len++;
            }
            if (len == n) {
                pos.add(i - len + 1);
                len = pi[len - 1];
            }
        }
        return pos;
    }

}

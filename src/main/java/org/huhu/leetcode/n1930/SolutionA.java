package org.huhu.leetcode.n1930;

class SolutionA implements Solution {

    @Override
    public int countPalindromicSubsequence(String s) {
        int cnt = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            // 左边界
            int l = s.indexOf(c);
            if (l < 0) {
                continue;
            }
            // 右边界
            int r = s.lastIndexOf(c);
            // 枚举中间字母
            boolean[] has = new boolean[26];
            for (int i = l + 1; i < r; i++) {
                int mid = s.charAt(i) - 'a';
                if (!has[mid]) {
                    has[mid] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }

}

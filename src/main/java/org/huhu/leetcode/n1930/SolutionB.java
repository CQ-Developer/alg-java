package org.huhu.leetcode.n1930;

class SolutionB implements Solution {

    @Override
    public int countPalindromicSubsequence(String s) {
        char[] chars = s.toCharArray();
        // 统计右侧字母
        int[] right = new int[26];
        for (char c : chars) {
            right[c - 'a']++;
        }
        int cnt = 0;
        boolean[] left = new boolean[26];
        boolean[][] has = new boolean[26][26];
        // 中间字母
        for (char c : chars) {
            right[c - 'a']--;
            // 枚举两侧
            for (int sid = 0; sid < 26; sid++) {
                if (left[sid] && right[sid] > 0 && !has[c - 'a'][sid]) {
                    has[c - 'a'][sid] = true;
                    cnt++;
                }
            }
            left[c - 'a'] = true;
        }
        return cnt;
    }

}

package org.huhu.leetcode.n1930;

class SolutionC implements Solution {

    @Override
    public int countPalindromicSubsequence(String s) {
        char[] chars = s.toCharArray();
        int r = 0;
        int[] right = new int[26];
        for (char c : chars) {
            int i = c - 'a';
            right[i]++;
            r |= 1 << i;
        }
        int l = 0;
        int[] mask = new int[26];
        for (char c : chars) {
            int i = c - 'a';
            if (--right[i] == 0) {
                r ^= 1 << i;
            }
            mask[i] |= l & r;
            l |= 1 << i;
        }
        int cnt = 0;
        for (int m : mask) {
            cnt += Integer.bitCount(m);
        }
        return cnt;
    }

}

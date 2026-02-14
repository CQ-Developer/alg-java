package org.huhu.leetcode.n848;

class SolutionA implements Solution {

    @Override
    public String shiftingLetters(String s, int[] shifts) {
        long suf = 0;
        int n = shifts.length;
        char[] c = s.toCharArray();
        for (int i = n - 1; i >= 0; i--) {
            suf = suf + shifts[i];
            c[i] = (char) ((c[i] - 'a' + suf) % 26 + 'a');
        }
        return String.valueOf(c);
    }

}

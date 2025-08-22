package org.huhu.leetcode.n2390;

class SolutionB implements Solution {

    @Override
    public String removeStars(String s) {
        char[] c = s.toCharArray();
        int w = 0;
        for (int r = 0; r < c.length; r++) {
            if (c[r] == '*') {
                w--;
            } else {
                c[w++] = c[r];
            }
        }
        return String.valueOf(c, 0, w);
    }

}

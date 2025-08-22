package org.huhu.leetcode.n2390;

class SolutionA implements Solution {

    @Override
    public String removeStars(String s) {
        var builder = new StringBuilder();
        for (int cnt = 0, i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '*') {
                cnt++;
            } else {
                if (cnt > 0) {
                    cnt--;
                } else {
                    builder.append(c);
                }
            }
        }
        return builder.reverse().toString();
    }

}

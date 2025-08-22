package org.huhu.leetcode.n2390;

class SolutionA implements Solution {

    @Override
    public String removeStars(String s) {
        var builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
                builder.deleteCharAt(builder.length() - 1);
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }

}

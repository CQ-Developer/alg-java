package org.huhu.leetcode.n844;

class SolutionA implements Solution {

    @Override
    public boolean backspaceCompare(String s, String t) {
        var a = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#') {
                int n = a.length();
                if (n > 0) {
                    a.deleteCharAt(n - 1);
                }
            } else {
                a.append(c);
            }
        }
        var b = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == '#') {
                int n = b.length();
                if (n > 0) {
                    b.deleteCharAt(n - 1);
                }
            } else {
                b.append(c);
            }
        }
        return a.toString().contentEquals(b);
    }

}

package org.huhu.leetcode.n316;

class SolutionA implements Solution {

    @Override
    public String removeDuplicateLetters(String s) {
        char[] chars = s.toCharArray();
        int[] count = new int['z' + 1], entered = new int['z' + 1];
        for (char c : chars) {
            count[c]++;
        }
        int n = 0;
        char[] stack = new char[chars.length];
        for (char c : chars) {
            count[c]--;
            if (entered[c] > 0) {
                continue;
            }
            while (n > 0 && c <= stack[n - 1] && count[stack[n - 1]] > 0) {
                entered[stack[--n]]--;
            }
            stack[n++] = c;
            entered[c]++;
        }
        return String.valueOf(stack, 0, n);
    }

}

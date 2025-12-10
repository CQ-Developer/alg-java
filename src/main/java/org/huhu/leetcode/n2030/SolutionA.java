package org.huhu.leetcode.n2030;

class SolutionA implements Solution {

    @Override
    public String smallestSubsequence(String s, int k, char letter, int repetition) {
        int n = s.length();
        int left = 0, inside = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == letter) {
                left++;
            }
        }
        int len = 0;
        char[] stk = new char[k];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            /*
             * m + (n - i) > k
             * 栈中元素数量 + 剩余元素数量 > k
             *
             * stk[m - 1] != letter || inside + left > repetition
             * 入栈的letter字符 + 剩余的letter字符 > repetition
             *
             * inside + (k - m) < repetition
             * 入栈的letter字符 + 栈中剩余空位 < repetition
             * 也就是说剩余的空位全部放上letter也不能满足最少repetition个letter的要求
             * 所以此时需要弹出元素腾出空间给letter
             */
            while (len > 0 && stk[len - 1] > c && len + n - i > k && (stk[len - 1] != letter || inside + left > repetition) || inside + k - len < repetition) {
                if (stk[--len] == letter) {
                    inside--;
                }
            }
            if (len < k) {
                stk[len++] = c;
                if (c == letter) {
                    inside++;
                }
            }
            if (c == letter) {
                left--;
            }
        }
        return String.valueOf(stk);
    }

}

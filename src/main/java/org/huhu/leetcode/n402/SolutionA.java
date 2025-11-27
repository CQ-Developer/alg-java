package org.huhu.leetcode.n402;

import java.util.ArrayList;
import java.util.List;

class SolutionA implements Solution {

    @Override
    public String removeKdigits(String num, int k) {
        List<Character> stack = new ArrayList<>();
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (k > 0 && !stack.isEmpty() && c < stack.getLast()) {
                stack.removeLast();
                k--;
            }
            stack.addLast(c);
        }
        // 此时的栈已经有序
        if (k > 0) {
            stack = stack.subList(0, stack.size() - k);
        }
        StringBuilder builder = new StringBuilder();
        for (char c : stack) {
            // 移除前导0
            if (builder.length() > 0 || c != '0') {
                builder.append(c);
            }
        }
        return builder.isEmpty() ? "0" : builder.toString();
    }

}

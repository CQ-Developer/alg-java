package org.huhu.leetcode.n71;

import java.util.ArrayList;
import java.util.List;

class SolutionA implements Solution {

    @Override
    public String simplifyPath(String path) {
        List<String> stack = new ArrayList<>();
        for (String p : path.split("/")) {
            if (p.isEmpty() || p.equals(".")) {
                continue;
            }
            if (!p.equals("..")) {
                stack.addLast(p);
            } else if (!stack.isEmpty()) {
                stack.removeLast();
            }
        }
        return "/" + String.join("/", stack);
    }

}

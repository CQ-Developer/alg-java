package org.huhu.leetcode.n3412;

import java.util.ArrayList;
import java.util.List;

class SolutionA implements Solution {

    @Override
    public long calculateScore(String s) {
        long score = 0;
        List<List<Integer>> stack = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            stack.add(new ArrayList<>());
        }
        for (int i = 0; i < s.length(); i++) {
            int j = s.charAt(i) - 'a';
            if (stack.get(25 - j).isEmpty()) {
                stack.get(j).addLast(i);
            } else {
                score += i - stack.get(25 - j).removeLast();
            }
        }
        return score;
    }

}

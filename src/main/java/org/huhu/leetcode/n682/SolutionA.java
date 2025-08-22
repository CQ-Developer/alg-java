package org.huhu.leetcode.n682;

import java.util.ArrayList;
import java.util.List;

class SolutionA implements Solution {

    @Override
    public int calPoints(String[] operations) {
        int score = 0;
        List<Integer> seq = new ArrayList<>();
        for (String s : operations) {
            if ("C".equals(s)) {
                score -= seq.removeLast();
            } else if ("D".equals(s)) {
                int x = seq.getLast() * 2;
                seq.addLast(x);
                score += x;
            } else if ("+".equals(s)) {
                int n = seq.size();
                int x = seq.get(n - 2) + seq.get(n - 1);
                seq.addLast(x);
                score += x;
            } else {
                int x = Integer.parseInt(s);
                seq.addLast(x);
                score += x;
            }
        }
        return score;
    }

}

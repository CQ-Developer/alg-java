package org.huhu.leetcode.n1441;

import java.util.ArrayList;
import java.util.List;

class SolutionB implements Solution {

    @Override
    public List<String> buildArray(int[] target, int n) {
        int p = 0;
        List<String> seq = new ArrayList<>();
        for (int t : target) {
            for (int x = 0; x < t - p - 1; x++) {
                seq.add("Push");
                seq.add("Pop");
            }
            seq.add("Push");
            p = t;
        }
        return seq;
    }

}

package org.huhu.leetcode.n1441;

import java.util.ArrayList;
import java.util.List;

class SolutionA implements Solution {

    @Override
    public List<String> buildArray(int[] target, int n) {
        List<String> seq = new ArrayList<>();
        int m = target.length;
        int i = 0, x = 1, s = 0;
        while (i < m) {
            if (s == 0) {
                seq.add("Push");
                s = x++;
                if (s == target[i]) {
                    i++;
                }
            } else {
                if (x == target[i]) {
                    if (i > 0 && s == target[i - 1]) {
                        seq.add("Push");
                        i++;
                        s = x++;
                    } else {
                        seq.add("Pop");
                        s--;
                    }
                } else {
                    seq.add("Push");
                    s = x++;
                }
            }
        }
        return seq;
    }

}

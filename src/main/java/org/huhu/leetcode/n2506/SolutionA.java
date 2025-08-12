package org.huhu.leetcode.n2506;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int similarPairs(String[] words) {
        int res = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (String word : words) {
            int k = 0;
            for (char c : word.toCharArray()) {
                k |= 1 << (c & 0x1f);
            }
            int p = cnt.getOrDefault(k, 0);
            res += p;
            cnt.put(k, p + 1);
        }
        return res;
    }

}

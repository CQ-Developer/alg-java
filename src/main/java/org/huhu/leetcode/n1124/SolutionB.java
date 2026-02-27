package org.huhu.leetcode.n1124;

import java.util.HashMap;
import java.util.Map;

class SolutionB implements Solution {

    @Override
    public int longestWPI(int[] hours) {
        int p = 0, ans = 0;
        Map<Integer, Integer> hash = new HashMap<>();
        hash.put(0, -1);
        for (int i = 0; i < hours.length; i++) {
            p += hours[i] > 8 ? 1 : -1;
            if (p > 0) {
                ans = i + 1;
            } else {
                ans = Math.max(ans, i - hash.getOrDefault(p - 1, i));
                hash.putIfAbsent(p, i);
            }
        }
        return ans;
    }

}

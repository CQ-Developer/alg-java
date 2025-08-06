package org.huhu.leetcode.n2260;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int minimumCardPickup(int[] cards) {
        int res = Integer.MAX_VALUE;
        Map<Integer, Integer> latest = new HashMap<>();
        for (int i = 0; i < cards.length; i++) {
            int x = cards[i];
            if (latest.containsKey(x)) {
                res = Math.min(res, i - latest.get(x) + 1);
            }
            latest.put(x, i);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

}

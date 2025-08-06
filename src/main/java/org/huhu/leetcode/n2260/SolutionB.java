package org.huhu.leetcode.n2260;

import java.util.HashSet;
import java.util.Set;

class SolutionB implements Solution {

    @Override
    public int minimumCardPickup(int[] cards) {
        Set<Integer> set = new HashSet<>();
        int res = Integer.MAX_VALUE;
        for (int l = 0, r = 0; r < cards.length; r++) {
            for (; set.contains(cards[r]); l++) {
                res = Math.min(res, r - l + 1);
                set.remove(cards[l]);
            }
            set.add(cards[r]);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

}

package org.huhu.leetcode.n1512;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        Map<Integer, Integer> caching = new HashMap<>();
        for (int x : nums) {
            int p = caching.getOrDefault(x, 0);
            res += p;
            caching.put(x, p + 1);
        }
        return res;
    }

}

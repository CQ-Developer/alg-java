package org.huhu.leetcode.n3623;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int countTrapezoids(int[][] points) {
        Map<Integer, Integer> tab = new HashMap<>();
        for (int[] point : points) {
            tab.merge(point[1], 1, Integer::sum);
        }
        long res = 0, p = 0;
        for (long v : tab.values()) {
            long k = v * (v - 1) / 2;
            res += p * k;
            p += k;
        }
        return (int) (res % 1000000007);
    }

}

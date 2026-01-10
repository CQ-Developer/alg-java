package org.huhu.leetcode.n447;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        for (int[] x : points) {
            Map<Integer, Integer> cnt = new HashMap<>();
            for (int[] y : points) {
                int d = (y[0] - x[0]) * (y[0] - x[0]) + (y[1] - x[1]) * (y[1] - x[1]);
                int p = cnt.getOrDefault(d, 0);
                ans += p * 2;
                cnt.put(d, p + 1);
            }
        }
        return ans;
    }

}

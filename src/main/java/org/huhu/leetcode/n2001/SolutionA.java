package org.huhu.leetcode.n2001;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public long interchangeableRectangles(int[][] rectangles) {
        long result = 0;
        Map<Double, Integer> hash = new HashMap<>();
        for (int[] rec : rectangles) {
            double d = (double) rec[0] / rec[1];
            int cnt = hash.getOrDefault(d, 0);
            result += cnt;
            hash.put(d, cnt + 1);
        }
        return result;
    }

}

package org.huhu.leetcode.n1014;

class SolutionA implements Solution {

    @Override
    public int maxScoreSightseeingPair(int[] values) {
        int res = Integer.MIN_VALUE;
        int mx = values[0] + 0;
        for (int i = 1; i < values.length; i++) {
            res = Math.max(res, mx + values[i] - i);
            mx = Math.max(mx, values[i] + i);
        }
        return res;
    }

}

package org.huhu.leetcode.n3361;

class SolutionA implements Solution {

    @Override
    public long shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {
        long[] nxtSum = new long[26 * 2 + 1], preSum = new long[26 * 2 + 1];
        for (int i = 0; i < 26 * 2; i++) {
            nxtSum[i + 1] = nxtSum[i] + nextCost[i % 26];
            preSum[i + 1] = preSum[i] + previousCost[i % 26];
        }
        long dist = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int x = s.charAt(i) - 'a', y = t.charAt(i) - 'a';
            dist += Math.min(nxtSum[y < x ? y + 26 : y] - nxtSum[x], preSum[x < y ? x + 27 : x + 1] - preSum[y + 1]);
        }
        return dist;
    }

}

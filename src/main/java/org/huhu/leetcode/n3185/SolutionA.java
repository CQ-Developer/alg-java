package org.huhu.leetcode.n3185;

class SolutionA implements Solution {

    @Override
    public long countCompleteDayPairs(int[] hours) {
        long result = 0;
        int[] cnt = new int[24];
        for (int hour : hours) {
            result += cnt[(24 - (hour % 24)) % 24];
            cnt[hour % 24]++;
        }
        return result;
    }

}

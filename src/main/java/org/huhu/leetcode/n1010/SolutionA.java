package org.huhu.leetcode.n1010;

class SolutionA implements Solution {

    @Override
    public int numPairsDivisibleBy60(int[] time) {
        int result = 0;
        int[] cnt = new int[60];
        for (int t : time) {
            result += cnt[(60 - (t % 60)) % 60];
            cnt[t % 60]++;
        }
        return result;
    }

}

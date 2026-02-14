package org.huhu.leetcode.n1523;

class SolutionA implements Solution {

    @Override
    public int countOdds(int low, int high) {
        int cnt = 0;
        for (int i = low; i <= high; i++) {
            cnt += i & 1;
        }
        return cnt;
    }

}

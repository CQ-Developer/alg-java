package org.huhu.leetcode.n1523;

class SolutionB implements Solution {

    @Override
    public int countOdds(int low, int high) {
        /*
         * 奇数可以表示为 2k - 1
         * 1 到 n 中的奇数可以表示为 1 <= 2k - 1 <= n
         * 1 <= k <= (n + 1) / 2
         * 1...low...high...n
         * 1...n中的奇数数量 - 1...low中的奇数数量
         */
        return (high + 1) / 2 - low / 2;
    }

}

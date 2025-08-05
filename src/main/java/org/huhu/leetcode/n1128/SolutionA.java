package org.huhu.leetcode.n1128;

class SolutionA implements Solution {

    @Override
    public int numEquivDominoPairs(int[][] dominoes) {
        int result = 0;
        int[][] cnt = new int[10][10];
        for (int[] domino : dominoes) {
            int i = domino[0], j = domino[1];
            result += i <= j ? cnt[i][j]++ : cnt[j][i]++;
        }
        return result;
    }

}

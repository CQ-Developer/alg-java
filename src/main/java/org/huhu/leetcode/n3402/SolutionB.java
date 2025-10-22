package org.huhu.leetcode.n3402;

class SolutionB implements Solution {

    @Override
    public int minimumOperations(int[][] grid) {
        int ops = 0;
        for (int j = 0; j < grid[0].length; j++) {
            int pre = -1;
            for (int[] row : grid) {
                int x = row[j];
                ops += Math.max(0, pre + 1 - x);
                pre = Math.max(pre + 1, x);
            }
        }
        return ops;
    }

}

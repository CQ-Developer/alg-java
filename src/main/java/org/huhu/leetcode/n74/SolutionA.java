package org.huhu.leetcode.n74;

class SolutionA implements Solution {

    @Override
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            int l = -1, r = row.length;
            while (l + 1 < r) {
                int i = l + (r - l) / 2;
                if (row[i] == target) {
                    return true;
                }
                if (row[i] < target) {
                    l = i;
                } else {
                    r = i;
                }
            }
        }
        return false;
    }

}

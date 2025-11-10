package org.huhu.leetcode.n1277;

/**
 * 枚举子数组的上界，将其转换为一维数组问题
 */
class SolutionA implements Solution {

    @Override
    public int countSquares(int[][] matrix) {
        int ans = 0;
        int m = matrix.length, n = matrix[0].length;
        // top为子数组的上界
        for (int top = 0; top < m; top++) {
            // 转换为一维数组问题
            int[] arr = new int[n];
            for (int i = top; i < m; i++) {
                int h = i - top + 1;
                for (int p = -1, j = 0; j < n; j++) {
                    arr[j] += matrix[i][j];
                    if (arr[j] != h) {
                        p = j;
                    } else if (j - p >= h) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

}

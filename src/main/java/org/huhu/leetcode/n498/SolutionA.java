package org.huhu.leetcode.n498;

class SolutionA implements Solution {

    @Override
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int i = 0;
        int[] ans = new int[m * n];
        for (int k = 0; k < m + n - 1; k++) {
            /*
             * k = i + j
             * j = k - i
             * 
             * 求j的最大值
             * 当i取最小值0时，j能取到最大值, 且j最大不能大于n-1
             * mx=min(k,n-1)
             * 
             * 求j的最小值
             * 当i取最大值m-1时, j能取到最小值, 且j最小不能小于0
             * mn=max(k-m+1,0)
             */
            int minJ = Math.max(k - m + 1, 0), maxJ = Math.min(k, n - 1);
            if (k % 2 == 0) {
                for (int j = minJ; j <= maxJ; j++) {
                    ans[i++] = mat[k - j][j];
                }
            } else {
                for (int j = maxJ; j >= minJ; j--) {
                    ans[i++] = mat[k - j][j];
                }
            }
        }
        return ans;
    }

}

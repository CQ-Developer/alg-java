package org.huhu.leetcode.n1504;

class SolutionB implements Solution {

    @Override
    public int numSubmat(int[][] mat) {
        int ans = 0;
        int m = mat.length, n = mat[0].length;
        for (int top = 0; top < m; top++) {
            int[] a = new int[n];
            for (int i = top; i < m; i++) {
                int h = i - top + 1;
                for (int p = -1, j = 0; j < n; j++) {
                    a[j] += mat[i][j];
                    if (a[j] == h) {
                        ans += j - p;
                    } else {
                        p = j;
                    }
                }
            }
        }
        return ans;
    }

}

package org.huhu.leetcode.n3257;

class SolutionA implements Solution {

    @Override
    public long maximumValueSum(int[][] board) {
        int m = board.length, n = board[0].length;

        int[][] p = new int[3][2];
        for (int[] a : p) {
            a[0] = Integer.MIN_VALUE;
        }

        int[][][] suf = new int[m][3][2];
        for (int i = m - 1; i > 1; i--) {
            update(board[i], n, p);
            for (int j = 0; j < 3; j++) {
                suf[i][j][0] = p[j][0];
                suf[i][j][1] = p[j][1];
            }
        }

        for (int[] a : p) {
            a[0] = Integer.MIN_VALUE;
        }

        long ans = Long.MIN_VALUE;
        for (int i = 1; i < m - 1; i++) {
            update(board[i - 1], n, p);
            // 第2辆车
            for (int j = 0; j < n; j++) {
                // 第1辆车
                for (int[] a : p) {
                    // 第3辆车
                    for (int[] b : suf[i + 1]) {
                        if (a[1] != j && b[1] != j && a[1] != b[1]) {
                            ans = Math.max(ans, (long) a[0] + board[i][j] + b[0]);
                            break;
                        }
                    }
                }
            }
        }

        return ans;
    }

    private void update(int[] row, int n, int[][] p) {
        for (int j = 0; j < n; j++) {
            int x = row[j];
            if (x > p[0][0]) {
                if (p[0][1] != j) {
                    if (p[1][1] != j) {
                        p[2] = p[1];
                    }
                    p[1] = p[0];
                }
                p[0] = new int[] { x, j };
            } else if (x > p[1][0] && p[0][1] != j) {
                if (p[1][1] != j) {
                    p[2] = p[1];
                }
                p[1] = new int[] { x, j };
            } else if (x > p[2][0] && p[0][1] != j && p[1][1] != j) {
                p[2] = new int[] { x, j };
            }
        }
    }

}

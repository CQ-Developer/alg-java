package org.huhu.leetcode.n1504;

class SolutionA implements Solution {

    @Override
    public int numSubmat(int[][] mat) {
        int ans = 0;
        int n = mat[0].length;
        int[][] stack = new int[n + 1][3];
        int[] height = new int[n];
        for (int[] row : mat) {
            for (int j = 0; j < n; j++) {
                if (row[j] == 1) {
                    height[j]++;
                } else {
                    height[j] = 0;
                }
            }
            int top = 0;
            stack[0][0] = stack[0][2] = -1;
            for (int r = 0; r < n; r++) {
                int h = height[r];
                // 出栈
                while (stack[top][2] >= h) {
                    top--;
                }
                // 更新
                int l = stack[top][0], cnt = stack[top][1];
                cnt += (r - l) * h;
                ans += cnt;
                // 入栈
                top++;
                stack[top][0] = r;
                stack[top][1] = cnt;
                stack[top][2] = h;
            }
        }
        return ans;
    }

}

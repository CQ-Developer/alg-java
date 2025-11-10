package org.huhu.leetcode.n1277;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionD implements Solution {

    @Override
    public int countSquares(int[][] matrix) {
        int cnt = 0;
        int n = matrix[0].length;
        int[] height = new int[n + 1];
        for (int[] row : matrix) {
            for (int j = 0; j < n; j++) {
                if (row[j] == 0) {
                    height[j] = 0;
                } else {
                    height[j]++;
                }
            }
            cnt += count(height);
        }
        return cnt;
    }

    private int count(int[] height) {
        int cnt = 0;
        Deque<Integer> stk = new ArrayDeque<>();
        stk.push(-1);
        for (int r = 0; r < height.length; r++) {
            int hr = height[r];
            while (stk.size() > 1 && height[stk.peek()] >= hr) {
                int h = height[stk.pop()];
                int l = stk.peek();
                int w = r - l - 1;
                int up = Math.min(h, w);
                int low = (l < 0 ? hr : Math.max(hr, height[l])) + 1;
                if (low <= up) {
                    cnt += (w * 2 + 2 - low - up) * (up - low + 1) / 2;
                }
            }
            stk.push(r);
        }
        return cnt;
    }

}

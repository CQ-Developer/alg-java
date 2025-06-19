package org.huhu.leetcode.n1439;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int kthSmallest(int[][] mat, int k) {
        int[] res = { 0 };
        for (int[] row : mat) {
            int i = 0;
            int[] cur = new int[res.length * row.length];
            for (int x : res) {
                for (int y : row) {
                    cur[i++] = x + y;
                }
            }
            Arrays.sort(cur);
            if (cur.length > k) {
                cur = Arrays.copyOfRange(cur, 0, k);
            }
            res = cur;
        }
        return res[k - 1];
    }

}

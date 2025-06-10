package org.huhu.leetcode.n378;

import java.util.PriorityQueue;
import java.util.Queue;

class SolutionB implements Solution {

    @Override
    public int kthSmallest(int[][] matrix, int k) {
        Queue<int[]> heap = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            heap.offer(new int[] { i, 0, matrix[i][0] });
        }
        for (int _k = 0; _k < k - 1; _k++) {
            int[] cur = heap.poll();
            int i = cur[0], j = cur[1];
            if (j + 1 < n) {
                heap.offer(new int[] { i, j + 1, matrix[i][j + 1] });
            }
        }
        return heap.poll()[2];
    }

}

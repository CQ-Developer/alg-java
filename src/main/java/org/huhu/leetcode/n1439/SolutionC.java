package org.huhu.leetcode.n1439;

import java.util.PriorityQueue;

class SolutionC implements Solution {

    @Override
    public int kthSmallest(int[][] mat, int k) {
        int n = mat.length;
        int[] ans = mat[0];
        for (int i = 1; i < n; i++) {
            ans = kthSmallestPairs(ans, ans.length, mat[i], mat[i].length, k);
        }
        return ans[k - 1];
    }

    private int[] kthSmallestPairs(int[] arr1, int m, int[] arr2, int n, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        heap.offer(new int[] { arr1[0] + arr2[0], 0, 0 });
        int p = 0;
        int[] ans = new int[Math.min(k, m * n)];
        while (!heap.isEmpty() && p < k) {
            int[] cur = heap.poll();
            int i = cur[1], j = cur[2];
            ans[p++] = arr1[i] + arr2[j];
            if (j == 0 && i + 1 < m) {
                heap.offer(new int[] { arr1[i + 1] + arr2[j], i + 1, j });
            }
            if (j + 1 < n) {
                heap.offer(new int[] { arr1[i] + arr2[j + 1], i, j + 1 });
            }
        }
        return ans;
    }

}

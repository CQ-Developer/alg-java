package org.huhu.leetcode.n786;

import java.util.PriorityQueue;

class SolutionA implements Solution {

    @Override
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> arr[a[0]] * arr[b[1]] - arr[b[0]] * arr[a[1]]);
        heap.offer(new int[] { 0, n - 1 });
        for (int i = 1; i < k; i++) {
            int[] cur = heap.poll();
            int x = cur[0], y = cur[1];
            if (x == 0 && y > 0) {
                heap.offer(new int[] { 0, y - 1 });
            }
            if (x + 1 < y) {
                heap.offer(new int[] { x + 1, y });
            }
        }
        int[] top = heap.peek();
        return new int[] { arr[top[0]], arr[top[1]] };
    }

}

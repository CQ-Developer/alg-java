package org.huhu.leetcode.n1508;

import java.util.PriorityQueue;

class SolutionA implements Solution {

    @Override
    public int rangeSum(int[] nums, int n, int left, int right) {
        var heap = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            heap.offer(new int[] { nums[i], i });
        }
        long sum = 0;
        for (int j = 1; j <= right; j++) {
            int[] top = heap.poll();
            int s = top[0], i = top[1];
            if (j >= left) {
                sum += s;
            }
            if (i + 1 < n) {
                heap.offer(new int[] { s + nums[i + 1], i + 1 });
            }
        }
        return (int) (sum % 1_000_000_007);
    }

}

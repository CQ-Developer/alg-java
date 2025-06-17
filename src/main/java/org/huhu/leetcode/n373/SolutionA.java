package org.huhu.leetcode.n373;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class SolutionA implements Solution {

    @Override
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        var heap = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            heap.offer(new int[] { nums1[i] + nums2[0], i, 0 });
        }
        while (res.size() < k) {
            int[] cur = heap.poll();
            int i = cur[1], j = cur[2];
            res.add(List.of(nums1[i], nums2[j]));
            if (j + 1 < nums2.length) {
                heap.offer(new int[] { nums1[i] + nums2[j + 1], i, j + 1 });
            }
        }
        return res;
    }

}

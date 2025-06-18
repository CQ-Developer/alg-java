package org.huhu.leetcode.n373;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class SolutionB implements Solution {

    @Override
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        heap.offer(new int[] { nums1[0] + nums2[0], 0, 0 });
        List<List<Integer>> res = new ArrayList<>();
        while (res.size() < k) {
            int[] cur = heap.poll();
            int i = cur[1], j = cur[2];
            res.add(List.of(nums1[i], nums2[j]));
            if (j == 0 && i + 1 < nums1.length) {
                heap.offer(new int[] { nums1[i + 1] + nums2[0], i + 1, 0 });
            }
            if (j + 1 < nums2.length) {
                heap.offer(new int[] { nums1[i] + nums2[j + 1], i, j + 1 });
            }
        }
        return res;
    }

}

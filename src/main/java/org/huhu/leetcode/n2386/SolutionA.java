package org.huhu.leetcode.n2386;

import java.util.Arrays;
import java.util.PriorityQueue;

class SolutionA implements Solution {

    @Override
    public long kSum(int[] nums, int k) {
        int n = nums.length;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                sum += nums[i];
            } else {
                nums[i] = -nums[i];
            }
        }
        Arrays.sort(nums);
        var heap = new PriorityQueue<long[]>((a, b) -> Long.compare(a[0], b[0]));
        heap.offer(new long[] { nums[0], 0 });
        long s = 0;
        for (int j = 1; j < k; j++) {
            long[] top = heap.poll();
            s = top[0];
            int i = (int) top[1];
            if (i + 1 < n) {
                heap.offer(new long[] { s + nums[i + 1], i + 1 });
                heap.offer(new long[] { s - nums[i] + nums[i + 1], i + 1 });
            }
        }
        return sum - s;
    }

}

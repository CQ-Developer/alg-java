package org.huhu.leetcode.n3381;

import java.util.Arrays;

class SolutionB implements Solution {

    @Override
    public long maxSubarraySum(int[] nums, int k) {
        // 假设前缀和的第一个元素的下标为 -1
        // 那么 minS[k-1] 与 minS[-1] 同余
        long[] minS = new long[k];
        Arrays.fill(minS, 0, k - 1, Long.MAX_VALUE / 2);
        long p = 0, mx = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            p += nums[i];
            int j = i % k;
            mx = Math.max(mx, p - minS[j]);
            minS[j] = Math.min(minS[j], p);
        }
        return mx;
    }

}

package org.huhu.leetcode.n3381;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public long maxSubarraySum(int[] nums, int k) {
        long pre = 0, ans = Long.MIN_VALUE;
        Map<Integer, Long> hash = new HashMap<>();
        hash.put(0, 0L);
        for (int r = 0; r < nums.length; r++) {
            pre += nums[r];
            long p = hash.getOrDefault((r + 1) % k, Long.MAX_VALUE / 2);
            ans = Math.max(ans, pre - p);
            hash.put((r + 1) % k, Math.min(pre, p));
        }
        return ans;
    }

}

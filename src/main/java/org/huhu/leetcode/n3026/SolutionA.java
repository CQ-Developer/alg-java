package org.huhu.leetcode.n3026;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public long maximumSubarraySum(int[] nums, int k) {
        long pre = 0, ans = Long.MIN_VALUE;
        Map<Integer, Long> map = new HashMap<>();
        for (int x : nums) {
            Long s = map.get(x - k);
            if (s != null) {
                ans = Math.max(ans, pre + x - s);
            }
            s = map.get(x + k);
            if (s != null) {
                ans = Math.max(ans, pre + x - s);
            }
            map.merge(x, pre, Math::min);
            pre += x;
        }
        return ans == Long.MIN_VALUE ? 0 : ans;
    }

}

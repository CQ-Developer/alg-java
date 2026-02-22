package org.huhu.leetcode.n2588;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public long beautifulSubarrays(int[] nums) {
        long ans = 0;
        int pre = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : nums) {
            cnt.merge(pre, 1, Integer::sum);
            pre ^= x;
            ans += cnt.getOrDefault(pre, 0);
        }
        return ans;
    }

}

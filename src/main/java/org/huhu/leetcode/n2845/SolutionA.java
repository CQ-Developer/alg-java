package org.huhu.leetcode.n2845;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        long ans = 0;

        Map<Integer, Long> cnt = new HashMap<>();
        cnt.put(k % modulo, 1L);

        int pre = 0;
        for (int x : nums) {
            pre += x % modulo == k ? 1 : 0;
            ans += cnt.getOrDefault(pre % modulo, 0L);
            cnt.merge((k + pre) % modulo, 1L, Long::sum);
        }

        return ans;
    }

}

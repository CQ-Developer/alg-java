package org.huhu.leetcode.n3739;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public long countMajoritySubarrys(int[] nums, int target) {
        Map<Integer, Integer> cnt = new HashMap<>();
        cnt.put(0, 1);
        long ans = 0;
        int s = 0, f = 0;
        for (int x : nums) {
            if (target == x) {
                f += cnt.getOrDefault(s++, 0);
            } else {
                f -= cnt.getOrDefault(--s, 0);
            }
            ans += f;
            cnt.merge(s, 1, Integer::sum);
        }
        return ans;
    }

}

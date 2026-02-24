package org.huhu.leetcode.n3755;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int maxBalancedSubarray(int[] nums) {
        int ans = 0;
        long xor = 0, dif = 0;
        Map<Long, Integer> cnt = new HashMap<>();
        cnt.put(0L, -1);
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
            dif += (nums[i] & 1) * 2 - 1;
            long k = (xor << 32) | (dif & 0xffffffffL);
            Integer j = cnt.get(k);
            if (j == null) {
                cnt.put(k, i);
            } else {
                ans = Math.max(ans, i - j);
            }
        }
        return ans;
    }

}

package org.huhu.leetcode.n3755;

import java.util.HashMap;
import java.util.Map;

class SolutionB implements Solution {

    record Tuple(int xor, int dif) {
    }

    @Override
    public int maxBalancedSubarray(int[] nums) {
        int xor = 0, dif = 0, ans = 0;
        Map<Tuple, Integer> cnt = new HashMap<>();
        cnt.put(new Tuple(xor, dif), -1);
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
            dif += (nums[i] & 1) * 2 - 1;
            var k = new Tuple(xor, dif);
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

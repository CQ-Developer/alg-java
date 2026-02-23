package org.huhu.leetcode.n525;

import java.util.HashMap;
import java.util.Map;

class SolutionB implements Solution {

    @Override
    public int findMaxLength(int[] nums) {
        int pre = 0, ans = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        cnt.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i] * 2 - 1;
            Integer j = cnt.get(pre);
            if (j != null) {
                ans = Math.max(ans, i - j);
            } else {
                cnt.put(pre, i);
            }
        }
        return ans;
    }

}

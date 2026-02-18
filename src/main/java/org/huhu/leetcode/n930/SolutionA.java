package org.huhu.leetcode.n930;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int numSubarraysWithSum(int[] nums, int goal) {
        int pre = 0, ans = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : nums) {
            cnt.merge(pre, 1, Integer::sum);
            pre += x;
            ans += cnt.getOrDefault(pre - goal, 0);
        }
        return ans;
    }

}

package org.huhu.leetcode.n219;

import java.util.HashMap;
import java.util.Map;

class SolutionB implements Solution {

    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> latest = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            if (i - latest.getOrDefault(x, i - k - 1) <= k) {
                return true;
            }
            latest.put(x, i);
        }
        return false;
    }

}

package org.huhu.leetcode.n219;

import java.util.HashSet;
import java.util.Set;

class SolutionA implements Solution {

    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (!window.add(nums[i])) {
                return true;
            }
            if (i >= k) {
                window.remove(nums[i - k]);
            }
        }
        return false;
    }

}

package org.huhu.leetcode.n2364;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long result = n * (n - 1L) / 2;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < n; i++) {
            result -= cnt.merge(nums[i] - i, 1, Integer::sum) - 1;
        }
        return result;
    }

}

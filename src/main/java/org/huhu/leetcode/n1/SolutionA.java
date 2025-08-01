package org.huhu.leetcode.n1;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();
        int[] result = { 0, 0 };
        for (int n = nums.length, i = 0; i < n; i++) {
            int a = nums[i], b = target - a;
            if (cache.containsKey(b)) {
                result[0] = cache.get(b);
                result[1] = i;
                break;
            }
            cache.put(a, i);
        }
        return result;
    }

}

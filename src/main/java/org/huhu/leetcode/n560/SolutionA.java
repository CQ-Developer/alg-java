package org.huhu.leetcode.n560;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int subarraySum(int[] nums, int k) {
        int p = 0, cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.merge(p, 1, Integer::sum);
            p += x;
            cnt += map.getOrDefault(p - k, 0);
        }
        return cnt;
    }

}

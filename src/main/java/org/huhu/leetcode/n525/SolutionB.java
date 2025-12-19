package org.huhu.leetcode.n525;

import java.util.HashMap;
import java.util.Map;

class SolutionB implements Solution {

    @Override
    public int findMaxLength(int[] nums) {
        int n = nums.length, mx = 0, p = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            p += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(p)) {
                mx = Math.max(mx, i - map.get(p));
            } else {
                map.put(p, i);
            }
        }
        return mx;
    }

}

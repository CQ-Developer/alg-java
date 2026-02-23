package org.huhu.leetcode.n525;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int findMaxLength(int[] nums) {
        int n = nums.length;

        int[] preSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int x = nums[i] * 2 - 1;
            preSum[i + 1] = preSum[i] + x;
        }

        int mx = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            int x = preSum[i];
            if (map.containsKey(x)) {
                mx = Math.max(mx, i - map.get(x));
            } else {
                map.put(x, i);
            }
        }

        return mx;
    }

}

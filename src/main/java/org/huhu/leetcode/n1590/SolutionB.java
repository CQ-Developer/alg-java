package org.huhu.leetcode.n1590;

import java.util.HashMap;
import java.util.Map;

class SolutionB implements Solution {

    @Override
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = (pre[i] + nums[i]) % p;
        }
        if (pre[n] == 0) {
            return 0;
        }
        int ans = n;
        Map<Integer, Integer> map = HashMap.newHashMap(n);
        for (int i = 0; i <= n; i++) {
            map.put((pre[i] + pre[n]) % p, i);
            int j = map.getOrDefault(pre[i], -n);
            ans = Math.min(ans, i - j);
        }
        return ans < n ? ans : -1;
    }

}

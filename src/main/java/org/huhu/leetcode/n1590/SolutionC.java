package org.huhu.leetcode.n1590;

import java.util.HashMap;
import java.util.Map;

class SolutionC implements Solution {

    @Override
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int x = 0;
        for (int i = 0; i < n; i++) {
            x = (x + nums[i]) % p;
        }
        if (x == 0) {
            return 0;
        }
        int ans = n, pre = 0;
        Map<Integer, Integer> map = HashMap.newHashMap(n);
        map.put((pre + x) % p, -1);
        for (int i = 0; i < n; i++) {
            pre = (pre + nums[i]) % p;
            map.put((pre + x) % p, i);
            int j = map.getOrDefault(pre, -n);
            ans = Math.min(ans, i - j);
        }
        return ans < n ? ans : -1;
    }

}

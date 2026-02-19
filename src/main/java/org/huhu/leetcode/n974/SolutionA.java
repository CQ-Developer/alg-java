package org.huhu.leetcode.n974;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0, pre = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : nums) {
            cnt.merge(pre, 1, Integer::sum);
            pre = (pre + x % k + k) % k;
            ans += cnt.getOrDefault(pre, 0);
        }
        return ans;
    }

}

package org.huhu.leetcode.n523;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public boolean checkSubarraySum(int[] nums, int k) {
        long pre = 0;
        Map<Long, Integer> cnt = new HashMap<>();
        cnt.put(0L, -1);
        for (int i = 0; i < nums.length; i++) {
            pre = (pre + nums[i]) % k;
            if (cnt.containsKey(pre)) {
                if (i - cnt.get(pre) >= 2) {
                    return true;
                }
            } else {
                cnt.put(pre, i);
            }
        }
        return false;
    }

}

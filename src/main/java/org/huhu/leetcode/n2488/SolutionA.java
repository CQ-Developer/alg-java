package org.huhu.leetcode.n2488;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int countSubarrays(int[] nums, int k) {
        Map<Integer, Integer> cnt = HashMap.newHashMap(nums.length);
        cnt.put(0, 1);
        int pre = 0, ans = 0;
        boolean noK = true;
        for (int x : nums) {
            if (x == k) {
                noK = false;
            } else if (x > k) {
                pre++;
            } else {
                pre--;
            }
            if (noK) {
                cnt.merge(pre, 1, Integer::sum);
            } else {
                ans += cnt.getOrDefault(pre, 0) + cnt.getOrDefault(pre - 1, 0);
            }
        }
        return ans;
    }

}

package org.huhu.leetcode.n3583;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int specialTriplets(int[] nums) {
        Map<Integer, Integer> suf = new HashMap<>();
        for (int num : nums) {
            suf.merge(num, 1, Integer::sum);
        }

        long ans = 0;
        Map<Integer, Integer> pre = new HashMap<>();
        for (int num : nums) {
            suf.merge(num, -1, Integer::sum);
            ans += (long) pre.getOrDefault(num * 2, 0) * suf.getOrDefault(num * 2, 0);
            pre.merge(num, 1, Integer::sum);
        }

        return (int) (ans % 1000000007);
    }

}

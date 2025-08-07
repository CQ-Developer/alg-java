package org.huhu.leetcode.n1679;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int maxOperations(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> tab = new HashMap<>();
        for (int num : nums) {
            if (tab.getOrDefault(k - num, 0) > 0) {
                res++;
                tab.merge(k - num, -1, Integer::sum);
            } else {
                tab.merge(num, 1, Integer::sum);
            }
        }
        return res;
    }

}

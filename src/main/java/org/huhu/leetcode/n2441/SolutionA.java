package org.huhu.leetcode.n2441;

import java.util.HashSet;
import java.util.Set;

class SolutionA implements Solution {

    @Override
    public int findMaxK(int[] nums) {
        int res = -1;
        Set<Integer> caching = new HashSet<>();
        for (int num : nums) {
            if (caching.contains(-num)) {
                res = Math.max(res, Math.abs(num));
            }
            caching.add(num);
        }
        return res;
    }

}

package org.huhu.leetcode.n1546;

import java.util.HashSet;
import java.util.Set;

class SolutionA implements Solution {

    @Override
    public int maxNonOverlapping(int[] nums, int target) {
        int p = 0, mx = 0;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (int x : nums) {
            p += x;
            if (set.contains(p - target)) {
                mx++;
                set.clear();
            }
            set.add(p);
        }
        return mx;
    }

}

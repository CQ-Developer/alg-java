package org.huhu.leetcode.n456;

import java.util.TreeMap;

class SolutionA implements Solution {

    @Override
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for (int i = 2; i < n; i++) {
            tree.merge(nums[i], 1, Integer::sum);
        }
        int left = nums[0];
        for (int i = 1; i < n - 1; i++) {
            if (left < nums[i]) {
                Integer right = tree.higherKey(left);
                if (right != null && nums[i] > right) {
                    return true;
                }
            }
            left = Math.min(left, nums[i]);
            tree.compute(nums[i + 1], (k, v) -> v == 1 ? null : v - 1);
        }
        return false;
    }

}

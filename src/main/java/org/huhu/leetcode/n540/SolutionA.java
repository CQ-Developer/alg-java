package org.huhu.leetcode.n540;

class SolutionA implements Solution {

    @Override
    public int singleNonDuplicate(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

}

package org.huhu.leetcode.n3542;

class SolutionA implements Solution {

    @Override
    public int minOperations(int[] nums) {
        int ops = 0, k = -1;
        for (int x : nums) {
            while (k > -1 && x < nums[k]) {
                k--;
                ops++;
            }
            if (k == -1 || x > nums[k]) {
                nums[++k] = x;
            }
        }
        return ops + k + (nums[0] > 0 ? 1 : 0);
    }

}

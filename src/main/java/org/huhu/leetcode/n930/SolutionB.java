package org.huhu.leetcode.n930;

class SolutionB implements Solution {

    @Override
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int l1 = 0, l2 = 0, s1 = 0, s2 = 0, cnt = 0;
        for (int r = 0; r < n; r++) {
            // s2 <= goal
            s2 += nums[r];
            for (; l2 <= r && s2 > goal; l2++) {
                s2 -= nums[l2];
            }
            // s1 < goal
            s1 += nums[r];
            for (; l1 <= r && s1 >= goal; l1++) {
                s1 -= nums[l1];
            }
            cnt += l1 - l2;
        }
        return cnt;
    }

}

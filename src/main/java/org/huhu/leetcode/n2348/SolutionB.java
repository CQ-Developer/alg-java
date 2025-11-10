package org.huhu.leetcode.n2348;

/**
 * 双指针
 */
class SolutionB implements Solution {

    @Override
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int start = i++;
                while (i < n && nums[i] == 0) {
                    i++;
                }
                long len = i - start;
                ans += len * (len + 1) / 2;
            }
        }
        return ans;
    }

}

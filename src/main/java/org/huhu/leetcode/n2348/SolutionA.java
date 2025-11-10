package org.huhu.leetcode.n2348;

/**
 * 空间压缩动态规划
 */
class SolutionA implements Solution {

    @Override
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int n = nums.length;
        for (int pre = 0, i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int cur = 1;
                if (i > 0 && nums[i - 1] == 0) {
                    cur += pre;
                }
                ans += cur;
                pre = cur;
            }
        }
        return ans;
    }

}

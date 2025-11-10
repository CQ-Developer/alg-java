package org.huhu.leetcode.n2348;

/**
 * 滑动窗口
 * p表示上一个非0数字的下标
 */
class SolutionC implements Solution {

    @Override
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        for (int p = -1, i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ans += i - p;
            } else {
                p = i;
            }
        }
        return ans;
    }

}

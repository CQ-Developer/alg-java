package org.huhu.leetcode.n2348;

/**
 * 增量法
 * p0表示: 当来带i时, 之前连续0的个数
 */
class SolutionD implements Solution {

    @Override
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int p0 = 0;
        for (int x : nums) {
            p0 = x == 0 ? p0 + 1 : 0;
            ans += p0;
        }
        return ans;
    }

}

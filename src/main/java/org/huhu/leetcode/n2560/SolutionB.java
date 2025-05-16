package org.huhu.leetcode.n2560;

class SolutionB implements Solution {

    @Override
    public int minCapability(int[] nums, int k) {
        int l = 0, r = 0;
        for (int x : nums) {
            r = Math.max(r, x);
        }
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (check(nums, k, m)) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

    /**
     * 贪心
     * 只要能偷一定偷, 偷完直接跳过一间房子
     * 因为只在乎被偷房屋的数量, 不在乎房屋中的具体金额
     */
    private boolean check(int[] nums, int k, int m) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= m) {
                if (++cnt >= k) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

}

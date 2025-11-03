package org.huhu.leetcode.n1793;

/**
 * 从k出发向两端移动
 * 先移动大的那个数
 */
class SolutionA implements Solution {

    @Override
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        int mx = nums[k], mn = nums[k];
        for (int i = k, j = k, t = 0; t < n - 1; t++) {
            if (j == n - 1 || i > 0 && nums[i - 1] > nums[j + 1]) {
                mn = Math.min(mn, nums[--i]);
            } else {
                mn = Math.min(mn, nums[++j]);
            }
            mx = Math.max(mx, mn * (j - i + 1));
        }
        return mx;
    }

}

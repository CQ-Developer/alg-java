package org.huhu.leetcode.n2439;

class SolutionA implements Solution {

    @Override
    public int minimizeArrayValue(int[] nums) {
        int l = nums[0], r = nums[0];
        for (int num : nums) {
            l = Math.min(l, num);
            r = Math.max(r, num);
        }
        while (l < r) {
            int m = l + (r - l) / 2;
            if (check(nums, m)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return r;
    }

    private boolean check(int[] nums, int mid) {
        long rest = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            rest = Math.max(0, nums[i] + rest - mid);
        }
        return nums[0] + rest <= mid;
    }

}

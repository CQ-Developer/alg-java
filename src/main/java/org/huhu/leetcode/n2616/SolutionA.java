package org.huhu.leetcode.n2616;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int l = 0, r = 0;
        for (int i = 1; i < nums.length; i++) {
            r = Math.max(r, nums[i] - nums[i - 1]);
        }
        while (l < r) {
            int m = l + (r - l) / 2;
            if (check(nums, p, m)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return r;
    }

    private boolean check(int[] nums, int p, int mx) {
        for (int i = 0; i + 1 < nums.length && p > 0; i++) {
            if (nums[i + 1] - nums[i] <= mx) {
                i++;
                p--;
            }
        }
        return p == 0;
    }

}

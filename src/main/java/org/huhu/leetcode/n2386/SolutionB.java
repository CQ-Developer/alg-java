package org.huhu.leetcode.n2386;

import java.util.Arrays;

class SolutionB implements Solution {

    private int k;

    @Override
    public long kSum(int[] nums, int k) {
        long s = 0;
        long l = -1, r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                s += nums[i];
            } else {
                nums[i] = -nums[i];
            }
            r += nums[i];
        }
        Arrays.sort(nums);
        while (l + 1 < r) {
            long mid = l + (r - l) / 2;
            this.k = k - 1;
            dfs(nums, 0, mid);
            if (this.k == 0) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return s - r;
    }

    private void dfs(int[] nums, int i, long x) {
        if (i == nums.length || nums[i] > x || this.k == 0) {
            return;
        }
        this.k--;
        dfs(nums, i + 1, x);
        dfs(nums, i + 1, x - nums[i]);
    }

}

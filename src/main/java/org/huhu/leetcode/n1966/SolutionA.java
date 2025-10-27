package org.huhu.leetcode.n1966;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int binarySearchableNumbers(int[] nums) {
        int n = nums.length;
        int[] cnt = new int[n];
        Arrays.fill(cnt, 1);
        // left < target
        int mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] < mx) {
                cnt[i] = 0;
            }
            mx = Math.max(mx, nums[i]);
        }
        // target < right
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > mn) {
                cnt[i] = 0;
            }
            mn = Math.min(mn, nums[i]);
            sum += cnt[i];
        }
        return sum;
    }

}

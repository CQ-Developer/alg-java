package org.huhu.leetcode.n719;

import java.util.Arrays;

class SolutionB implements Solution {

    @Override
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0, r = nums[n - 1] - nums[0];
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (count(nums, n, m) >= k) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private int count(int[] nums, int n, int x) {
        int cnt = 0;
        for (int l = 0, r = 0; r < n; r++) {
            while (nums[r] - nums[l] > x) {
                l++;
            }
            cnt += r - l;
        }
        return cnt;
    }

}

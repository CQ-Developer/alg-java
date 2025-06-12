package org.huhu.leetcode.n719;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0, r = nums[n - 1] - nums[0];
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (check(nums, n, mid) >= k) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private int check(int[] nums, int n, int x) {
        int cnt = 0;
        for (int j = 1, i = 0; i < n; i++) {
            while (j < n && nums[j] - nums[i] <= x) {
                j++;
            }
            cnt += j - i - 1;
        }
        return cnt;
    }

}

package org.huhu.leetcode.n2909;

class SolutionA implements Solution {

    @Override
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];
        right[n - 1] = nums[n - 1];
        for (int i = n - 2; i > 1; i--) {
            right[i] = Math.min(right[i + 1], nums[i]);
        }
        int ans = Integer.MAX_VALUE;
        for (int left = nums[0], j = 1; j < n - 1; j++) {
            if (left < nums[j] && right[j + 1] < nums[j]) {
                ans = Math.min(ans, left + nums[j] + right[j + 1]);
            }
            left = Math.min(left, nums[j]);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

}

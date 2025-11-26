package org.huhu.leetcode.n2962;

class SolutionA implements Solution {

    @Override
    public long countSubarrays(int[] nums, int k) {
        int mx = 0;
        for (int x : nums) {
            mx = Math.max(mx, x);
        }
        long ans = 0;
        for (int cnt = 0, l = 0, r = 0; r < nums.length; r++) {
            if (nums[r] == mx) {
                cnt++;
            }
            for (; cnt >= k; l++) {
                if (nums[l] == mx) {
                    cnt--;
                }
            }
            ans += l;
        }
        return ans;
    }

}

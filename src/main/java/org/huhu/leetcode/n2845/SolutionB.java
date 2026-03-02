package org.huhu.leetcode.n2845;

import java.util.List;

class SolutionB implements Solution {

    @Override
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        long ans = 0;

        int[] cnt = new int[Math.min(nums.size() + 1, modulo)];
        cnt[0] = 1;

        int pre = 0;
        for (int x : nums) {
            pre += x % modulo == k ? 1 : 0;
            if (pre >= k) {
                ans += cnt[(pre - k) % modulo];
            }
            cnt[pre % modulo]++;
        }

        return ans;
    }

}

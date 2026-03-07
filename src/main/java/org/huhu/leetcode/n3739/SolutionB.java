package org.huhu.leetcode.n3739;

class SolutionB implements Solution {

    @Override
    public long countMajoritySubarrys(int[] nums, int target) {
        int n = nums.length;
        int[] cnt = new int[2 * n + 1];
        cnt[n] = 1;
        long ans = 0;
        int s = n, f = 0;
        for (int x : nums) {
            if (x == target) {
                f += cnt[s++];
            } else {
                f -= cnt[--s];
            }
            ans += f;
            cnt[s]++;
        }
        return ans;
    }

}

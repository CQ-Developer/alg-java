package org.huhu.leetcode.n974;

class SolutionB implements Solution {

    @Override
    public int subarraysDivByK(int[] nums, int k) {
        int pre = 0, ans = 0;
        int[] cnt = new int[k];
        for (int x : nums) {
            cnt[pre]++;
            pre = (pre + x % k + k) % k;
            ans += cnt[pre];
        }
        return ans;
    }

}

package org.huhu.leetcode.n2488;

class SolutionB implements Solution {

    @Override
    public int countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] cnt = new int[n * 2];
        cnt[n] = 1;
        int pre = n, ans = 0;
        boolean noK = true;
        for (int x : nums) {
            if (x == k) {
                noK = false;
            } else if (x > k) {
                pre++;
            } else {
                pre--;
            }
            if (noK) {
                cnt[pre]++;
            } else {
                ans += cnt[pre] + cnt[pre - 1];
            }
        }
        return ans;
    }

}

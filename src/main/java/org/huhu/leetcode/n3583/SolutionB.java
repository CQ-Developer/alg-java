package org.huhu.leetcode.n3583;

class SolutionB implements Solution {

    @Override
    public int specialTriplets(int[] nums) {
        int mx = 0;
        for (int x : nums) {
            mx = Math.max(mx, x);
        }

        int[] suf = new int[mx + 1];
        for (int x : nums) {
            suf[x]++;
        }

        long ans = 0;
        int[] pre = new int[mx + 1];
        for (int x : nums) {
            suf[x]--;
            if (x * 2 <= mx) {
                ans += (long) pre[x * 2] * suf[x * 2];
            }
            pre[x]++;
        }

        return (int) (ans % 1000000007);
    }

}

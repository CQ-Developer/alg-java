package org.huhu.leetcode.n1524;

class SolutionB implements Solution {

    static final int M = 1000000007;

    @Override
    public int numOfSubarrays(int[] arr) {
        long ans = 0;
        int pre = 0;
        int[] cnt = { 1, 0 };
        for (int x : arr) {
            pre += x;
            cnt[pre & 1]++;
            ans += cnt[(pre & 1) ^ 1];
        }
        return (int) (ans % M);
    }

}

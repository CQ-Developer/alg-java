package org.huhu.leetcode.n2748;

class SolutionA implements Solution {

    @Override
    public int countBeautifulPairs(int[] nums) {
        int res = 0;
        int[] cnt = new int[10];
        for (int x : nums) {
            for (int i = 1; i < 10; i++) {
                if (cnt[i] > 0 && gcd(i, x % 10) == 1) {
                    res += cnt[i];
                }
            }
            while (x >= 10) {
                x /= 10;
            }
            cnt[x]++;
        }
        return res;
    }

    private int gcd(int a, int b) {
        while (b > 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

}

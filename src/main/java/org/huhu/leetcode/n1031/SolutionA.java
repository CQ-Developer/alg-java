package org.huhu.leetcode.n1031;

class SolutionA implements Solution {

    @Override
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int n = nums.length;
        int[] s = new int[n + 1];
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] + nums[i];
        }
        return Math.max(f(s, firstLen, secondLen), f(s, secondLen, firstLen));
    }

    private int f(int[] s, int firstLen, int secondLen) {
        int res = 0, a = 0;
        for (int i = firstLen + secondLen; i < s.length; i++) {
            a = Math.max(a, s[i - secondLen] - s[i - secondLen - firstLen]);
            res = Math.max(res, a + s[i] - s[i - secondLen]);
        }
        return res;
    }

}

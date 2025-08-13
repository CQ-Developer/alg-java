package org.huhu.leetcode.n1031;

class SolutionB implements Solution {

    @Override
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int n = nums.length;
        int[] s = new int[n + 1];
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] + nums[i];
        }
        int res = 0, a = 0, b = 0;
        for (int i = firstLen + secondLen; i <= n; i++) {
            a = Math.max(a, s[i - firstLen] - s[i - firstLen - secondLen]);
            b = Math.max(b, s[i - secondLen] - s[i - secondLen - firstLen]);
            res = Math.max(res, Math.max(a + s[i] - s[i - firstLen], b + s[i] - s[i - secondLen]));
        }
        return res;
    }

}

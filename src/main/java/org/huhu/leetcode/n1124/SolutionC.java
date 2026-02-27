package org.huhu.leetcode.n1124;

/**
 * 同 {@link SolutionB}.
 * 使用 pos 数组代替 hash 表,
 * 为了防止数组下标负数问题, 对 pre 进行取反.
 */
class SolutionC implements Solution {

    @Override
    public int longestWPI(int[] hours) {
        int n = hours.length;
        int[] pos = new int[n + 2];
        int pre = 0, ans = 0;
        for (int i = 1; i <= n; i++) {
            pre -= hours[i - 1] > 8 ? 1 : -1;
            if (pre < 0) {
                ans = i;
            } else {
                if (pos[pre + 1] > 0) {
                    ans = Math.max(ans, i - pos[pre + 1]);
                }
                if (pos[pre] == 0) {
                    pos[pre] = i;
                }
            }
        }
        return ans;
    }

}

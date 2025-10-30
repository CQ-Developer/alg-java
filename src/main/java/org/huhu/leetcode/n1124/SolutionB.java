package org.huhu.leetcode.n1124;

class SolutionB implements Solution {

    @Override
    public int longestWPI(int[] hours) {
        int n = hours.length, ans = 0, s = 0;
        int[] pos = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            s -= hours[i - 1] > 8 ? 1 : -1;
            if (s < 0) {
                ans = i;
            } else {
                if (pos[s + 1] > 0) {
                    ans = Math.max(ans, i - pos[s + 1]);
                }
                if (pos[s] == 0) {
                    pos[s] = i;
                }
            }
        }
        return ans;
    }

}

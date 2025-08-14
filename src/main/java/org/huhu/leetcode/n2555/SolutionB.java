package org.huhu.leetcode.n2555;

class SolutionB implements Solution {

    @Override
    public int maximizeWin(int[] prizePositions, int k) {
        int n = prizePositions.length;
        if (k * 2 + 1 >= prizePositions[n - 1] - prizePositions[0]) {
            return n;
        }
        int res = 0, mx = 0;
        for (int l = 0, r = 0, i = 0; i < n; i++) {
            while (r < n && prizePositions[r] - prizePositions[i] <= k) {
                r++;
            }
            res = Math.max(res, mx + r - i);
            while (prizePositions[i] - prizePositions[l] > k) {
                l++;
            }
            mx = Math.max(mx, i - l + 1);
        }
        return res;
    }

}

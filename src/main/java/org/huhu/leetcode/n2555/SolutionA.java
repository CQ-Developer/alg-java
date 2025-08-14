package org.huhu.leetcode.n2555;

class SolutionA implements Solution {

    @Override
    public int maximizeWin(int[] prizePositions, int k) {
        int n = prizePositions.length;
        if (k * 2 + 1 >= prizePositions[n - 1] - prizePositions[0]) {
            return n;
        }
        int res = 0;
        int[] mx = new int[n + 1];
        for (int l = 0, r = 0; r < n; r++) {
            while (prizePositions[r] - prizePositions[l] > k) {
                l++;
            }
            res = Math.max(res, mx[l] + r - l + 1);
            mx[r + 1] = Math.max(mx[r], r - l + 1);
        }
        return res;
    }

}

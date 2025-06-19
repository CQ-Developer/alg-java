package org.huhu.leetcode.n1439;

class SolutionB implements Solution {

    @Override
    public int kthSmallest(int[][] mat, int k) {
        int l = 0, r = 0;
        for (int[] row : mat) {
            l += row[0];
            r += row[row.length - 1];
        }
        int base = l;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (check(mat, 0, k, mid - base) >= k) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private int check(int[][] mat, int i, int k, int rest) {
        if (i == mat.length) {
            return 1;
        }
        int ans = 0;
        for (int x : mat[i]) {
            if (x - mat[i][0] > rest || ans >= k) {
                break;
            }
            ans += check(mat, i + 1, k, rest - x + mat[i][0]);
        }
        return ans;
    }

}

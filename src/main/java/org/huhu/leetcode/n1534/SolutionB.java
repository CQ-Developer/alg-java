package org.huhu.leetcode.n1534;

class SolutionB implements Solution {

    @Override
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int mx = 0;
        for (int x : arr) {
            mx = Math.max(mx, x);
        }
        int ans = 0;
        int[] s = new int[mx + 2];
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (Math.abs(arr[j] - arr[k]) > b) {
                    continue;
                }
                int l = Math.max(arr[j] - a, Math.max(arr[k] - c, 0));
                int r = Math.min(arr[j] + a, Math.min(arr[k] + c, mx));
                ans += Math.max(s[r + 1] - s[l], 0);
            }
            for (int v = arr[j] + 1; v < mx + 2; v++) {
                s[v]++;
            }
        }
        return ans;
    }

}

package org.huhu.leetcode.n1442;

class SolutionA implements Solution {

    @Override
    public int countTriplets(int[] arr) {
        int cnt = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j; k < n; k++) {
                    int a = 0;
                    for (int p = i; p < j; p++) {
                        a ^= arr[p];
                    }
                    int b = 0;
                    for (int p = j; p <= k; p++) {
                        b ^= arr[p];
                    }
                    if (a == b) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

}

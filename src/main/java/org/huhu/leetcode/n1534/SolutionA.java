package org.huhu.leetcode.n1534;

class SolutionA implements Solution {

    @Override
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length, cnt = 0;
        for (int i = 0; i < n - 2; i++) {
            int x = arr[i];
            for (int j = i + 1; j < n - 1; j++) {
                int y = arr[j];
                for (int k = j + 1; k < n; k++) {
                    int z = arr[k];
                    if (Math.abs(x - y) <= a && Math.abs(y - z) <= b && Math.abs(x - z) <= c) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

}

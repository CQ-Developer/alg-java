package org.huhu.leetcode.n1442;

class SolutionC implements Solution {

    @Override
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] xor = new int[n + 1];
        for (int i = 0; i < n; i++) {
            xor[i + 1] = xor[i] ^ arr[i];
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (xor[i] == xor[k + 1]) {
                    cnt += k - i;
                }
            }
        }
        return cnt;
    }

}

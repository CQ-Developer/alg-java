package org.huhu.leetcode.n1442;

class SolutionB implements Solution {

    @Override
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] xor = new int[n + 1];
        for (int i = 0; i < n; i++) {
            xor[i + 1] = xor[i] ^ arr[i];
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j; k < n; k++) {
                    int a = xor[i] ^ xor[j];
                    int b = xor[j] ^ xor[k + 1];
                    if (a == b) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

}

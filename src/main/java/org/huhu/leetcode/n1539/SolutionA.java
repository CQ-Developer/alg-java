package org.huhu.leetcode.n1539;

class SolutionA implements Solution {

    @Override
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length, num = 1;
        for (int i = 0; k > 0; num++) {
            if (i < n && arr[i] == num) {
                i++;
            } else {
                k--;
            }
        }
        return num - 1;
    }

}

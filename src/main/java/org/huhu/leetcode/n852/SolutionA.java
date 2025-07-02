package org.huhu.leetcode.n852;

class SolutionA implements Solution {

    @Override
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (arr[i] > arr[i + 1]) {
                r = i;
            } else {
                l = i;
            }
        }
        return r;
    }

}

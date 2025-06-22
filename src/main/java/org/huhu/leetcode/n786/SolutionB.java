package org.huhu.leetcode.n786;

class SolutionB implements Solution {

    @Override
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double l = 0, r = 1;
        while (true) {
            double mid = l + (r - l) / 2;
            int x = 0, y = 1, cnt = 0;
            for (int i = 0, j = 1; j < n; j++) {
                for (; 1.0 * arr[i] / arr[j] < mid; i++) {
                    if (arr[i] * y > arr[j] * x) {
                        x = arr[i];
                        y = arr[j];
                    }
                }
                cnt += i;
            }
            if (cnt == k) {
                return new int[] { x, y };
            }
            if (cnt < k) {
                l = mid;
            } else {
                r = mid;
            }
        }
    }

}

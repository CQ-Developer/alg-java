package org.huhu.leetcode.n1539;

class SolutionB implements Solution {

    @Override
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int l = 0, r = arr[n - 1] + k;
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (mid - check(arr, n, mid + 1) >= k) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return r;
    }

    private int check(int[] arr, int n, int target) {
        int l = -1, r = n;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (arr[i] >= target) {
                r = i;
            } else {
                l = i;
            }
        }
        return r;
    }

}

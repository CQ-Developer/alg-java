package org.huhu.leetcode.n3464;

import java.util.Arrays;

class SolutionB implements Solution {

    public int maxDistance(int side, int[][] points, int k) {
        int n = points.length;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            int x = points[i][0], y = points[i][1];
            if (x == 0) {
                arr[i] = y;
            } else if (y == side) {
                arr[i] = side + x;
            } else if (x == side) {
                arr[i] = 3L * side - y;
            } else {
                arr[i] = 4L * side - x;
            }
        }
        Arrays.sort(arr);
        int l = 1, r = (int) (4L * side / k) + 1;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (check(arr, side, k, m)) {
                l = m;
            } else {
                r = m;
            }
        }
        return l;
    }

    private boolean check(long[] arr, int side, int k, int low) {
        int n = arr.length;
        int[] idx = new int[k];
        for (int j = 1; j < k; j++) {
            int i = idx[j - 1];
            idx[j] = check(arr, arr[i] + low);
            if (idx[j] == n) {
                return false;
            }
        }
        if (arr[idx[k - 1]] - arr[0] <= 4l * side - low) {
            return true;
        }
        for (int i = 1; i < idx[1]; i++) {
            idx[0] = i;
            for (int j = 1; j < k; j++) {
                while (arr[idx[j]] - arr[idx[j - 1]] < low) {
                    idx[j]++;
                    if (idx[j] == n) {
                        return false;
                    }
                }
            }
            if (arr[idx[k - 1]] - arr[idx[0]] > 4L * side - low) {
                continue;
            }
            return true;
        }
        return false;
    }

    private int check(long[] arr, long tar) {
        int l = -1, r = arr.length;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (arr[m] >= tar) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

}

package org.huhu.leetcode.n3464;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
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
        // 起点为start
        out: for (long start : arr) {
            // arr[n - 1] - arr[0] <= 4 * side - low
            long end = start + 4L * side - low;
            long cur = start;
            // 还需要找rest个点
            for (int rest = 0; rest < k - 1; rest++) {
                // arr[i + 1] - arr[i] >= low
                int i = check(arr, cur + low);
                if (i == arr.length || arr[i] > end) {
                    continue out;
                }
                cur = arr[i];
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

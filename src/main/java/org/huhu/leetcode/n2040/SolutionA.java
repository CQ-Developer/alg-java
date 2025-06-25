package org.huhu.leetcode.n2040;

class SolutionA implements Solution {

    @Override
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        int m = nums1.length, n = nums2.length;
        long a = (long) nums1[0] * nums2[0],
             b = (long) nums1[m - 1] * nums2[n - 1],
             c = (long) nums1[0] * nums2[n - 1],
             d = (long) nums1[m - 1] * nums2[0];
        int x = find(nums1), y = find(nums2);
        long left = Math.min(a, Math.min(b, Math.min(c, d)));
        long right = Math.max(a, Math.max(b, Math.max(c, d)));
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (check(nums1, m, nums2, n, x, y, mid) >= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private long check(int[] a, int m, int[] b, int n, int x, int y, long up) {
        long cnt = 0;
        int i, j;
        if (up < 0) {
            // 右上
            i = 0;
            j = y;
            while (i < x && j < n) {
                if ((long) a[i] * b[j] > up) {
                    j++;
                } else {
                    i++;
                    cnt += n - j;
                }
            }
            // 左下
            i = x;
            j = 0;
            while (i < m && j < y) {
                if ((long) a[i] * b[j] > up) {
                    i++;
                } else {
                    j++;
                    cnt += m - i;
                }
            }
        } else {
            // 右上左下
            cnt += (long) x * (n - y) + (long) (m - x) * y;
            // 左上
            i = 0;
            j = y - 1;
            while (i < x && j >= 0) {
                if ((long) a[i] * b[j] > up) {
                    i++;
                } else {
                    j--;
                    cnt += x - i;
                }
            }
            // 右下
            i = x;
            j = n - 1;
            while (i < m && j >= y) {
                if ((long) a[i] * b[j] > up) {
                    j--;
                } else {
                    i++;
                    cnt += j - y + 1;
                }
            }
        }
        return cnt;
    }

    private int find(int[] a) {
        int l = -1, r = a.length;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (a[i] >= 0) {
                r = i;
            } else {
                l = i;
            }
        }
        return r;
    }

}

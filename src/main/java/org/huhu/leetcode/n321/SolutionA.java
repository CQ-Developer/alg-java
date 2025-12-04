package org.huhu.leetcode.n321;

class SolutionA implements Solution {

    @Override
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] mx = new int[k];
        int m = nums1.length, n = nums2.length;
        for (int i = 0; i <= k; i++) {
            if (i <= m && k - i <= n) {
                int[] cur = merge(peekMax(nums1, i), peekMax(nums2, k - i), k);
                if (compare(cur, mx, 0, 0) > 0) {
                    mx = cur;
                }
            }
        }
        return mx;
    }

    private int[] peekMax(int[] nums, int k) {
        int top = -1, re = nums.length - k;
        int[] stack = new int[k];
        for (int x : nums) {
            while (re > 0 && top > -1 && x > stack[top]) {
                top--;
                re--;
            }
            if (top + 1 < k) {
                stack[++top] = x;
            } else {
                re--;
            }
        }
        return stack;
    }

    private int[] merge(int[] a, int[] b, int k) {
        int i = 0, m = a.length;
        int j = 0, n = b.length;
        int p = 0;
        int[] nums = new int[k];
        while (i < m && j < n) {
            nums[p++] = compare(a, b, i, j) > 0 ? a[i++] : b[j++];
        }
        while (i < m) {
            nums[p++] = a[i++];
        }
        while (j < n) {
            nums[p++] = b[j++];
        }
        return nums;
    }

    private int compare(int[] a, int[] b, int i, int j) {
        int m = a.length, n = b.length;
        while (i < m && j < n) {
            if (a[i] != b[j]) {
                return a[i] - b[j];
            }
            i++;
            j++;
        }
        return (m - i) - (n - j);
    }

}

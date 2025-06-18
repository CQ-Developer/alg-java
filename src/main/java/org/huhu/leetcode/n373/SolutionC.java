package org.huhu.leetcode.n373;

import java.util.ArrayList;
import java.util.List;

class SolutionC implements Solution {

    @Override
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int m = nums1.length, n = nums2.length;
        int left = nums1[0] + nums2[0], right = nums1[m - 1] + nums2[n - 1];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(nums1, m, nums2, n, mid) >= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int r = n - 1, l = 0; l < m; l++) {
            while (r >= 0 && nums1[l] + nums2[r] >= left) {
                r--;
            }
            for (int i = 0; i <= r && k > 0; i++, k--) {
                res.add(List.of(nums1[l], nums2[i]));
            }
        }
        for (int r = n - 1, l = 0; l < m && k > 0; l++) {
            int i = l;
            while (l + 1 < m && nums1[l] == nums1[l + 1]) {
                l++;
            }
            while (r >= 0 && nums1[l] + nums2[r] > left) {
                r--;
            }
            int j = r;
            while (r > 0 && nums2[r] == nums2[r - 1]) {
                r--;
            }
            if (nums1[l] + nums2[r] == left) {
                int cnt = (int) Math.min(k, (l - i + 1L) * (j - r + 1L));
                for (int c = 0; c < cnt && k > 0; c++, k--) {
                    res.add(List.of(nums1[l], nums2[r]));
                }
            }
        }
        return res;
    }

    private long check(int[] nums1, int m, int[] nums2, int n, int x) {
        long cnt = 0;
        int l = 0, r = n - 1;
        while (l < m && r >= 0) {
            if (nums1[l] + nums2[r] > x) {
                r--;
            } else {
                l++;
                cnt += r + 1;
            }
        }
        return cnt;
    }

}

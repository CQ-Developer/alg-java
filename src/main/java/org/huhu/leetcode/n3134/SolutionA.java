package org.huhu.leetcode.n3134;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int medianOfUniquenessArray(int[] nums) {
        int n = nums.length;
        long k = (n * (n + 1L) / 2 + 1) / 2;
        int l = 0, r = n;
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (check(nums, n, k, mid)) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return r;
    }

    private boolean check(int[] nums, int n, long k, int up) {
        long cnt = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int l = 0, r = 0; r < n; r++) {
            freq.merge(nums[r], 1, Integer::sum);
            for (; freq.size() > up; l++) {
                freq.compute(nums[l], (_k, v) -> v == 1 ? null : v - 1);
            }
            if ((cnt += r - l + 1) >= k) {
                return true;
            }
        }
        return false;
    }

}

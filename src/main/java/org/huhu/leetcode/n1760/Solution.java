package org.huhu.leetcode.n1760;

class Solution {

    public int minimumSize(int[] nums, int maxOperations) {
        int l = 1, r = 0;
        for (int num : nums) {
            r = Math.max(r, num);
        }
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (check(nums, maxOperations, m)) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private boolean check(int[] nums, int ops, int top) {
        int cnt = 0;
        for (int num : nums) {
            cnt += (num - 1) / top;
            if (cnt > ops) {
                return false;
            }
        }
        return true;
    }

}

package org.huhu.leetcode.n2560;

class SolutionA implements Solution {

    @Override
    public int minCapability(int[] nums, int k) {
        int l = 0, r = 0;
        for (int num : nums) {
            r = Math.max(r, num);
        }
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (check(nums, k, m)) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

    /**
     * dynamic programming
     */
    private boolean check(int[] nums, int k, int max) {
        int f1 = 0, f2 = 0;
        for (int num : nums) {
            // f[i] = f[i - 1]
            if (num > max) {
                f1 = f2;
            }
            // f[i] = max(f[i], f[i - 2] + 1)
            else {
                int t = f2;
                f2 = Math.max(f2, f1 + 1);
                f1 = t;
            }
        }
        return f2 >= k;
    }

}

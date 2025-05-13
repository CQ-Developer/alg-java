package org.huhu.leetcode.n2064;

class Solution {

    public int minimizedMaximum(int n, int[] quantities) {
        int l = 1, r = 0;
        for (int q : quantities) {
            r = Math.max(r, q);
        }
        while (l <= r) {
            int m = l + (r - l + 1) / 2;
            if (check(n, quantities, m)) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    /**
     * <pre>{@code
     * private boolean check(int n, int[] quantities, int x) {
     *     int count = 0;
     *     for (int quantity : quantities) {
     *         // 向上取整写法
     *         count += (quantity - 1) / x + 1;
     *         if (count > n) {
     *             return false;
     *         }
     *     }
     *     return true;
     * }
     * }</pre>
     */
    private boolean check(int n, int[] quantities, int x) {
        int count = quantities.length;
        for (int quantity : quantities) {
            // 已贡献了1次, 剩余可贡献次数
            count += (quantity - 1) / x;
            if (count > n) {
                return false;
            }
        }
        return true;
    }

}

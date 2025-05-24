package org.huhu.leetcode.n2517;

import java.util.Arrays;

class SolutionA implements Solution {

    @Override
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int n = price.length;
        int l = 0, r = price[n - 1] - price[0];
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (check(price, k, m)) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

    private boolean check(int[] prices, int k, int d) {
        int p = -d;
        for (int price : prices) {
            if (price - p >= d) {
                p = price;
                k--;
            }
        }
        return k <= 0;
    }

}

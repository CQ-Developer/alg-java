package org.huhu.leetcode.n2342;

class SolutionA implements Solution {

    @Override
    public int maximumSum(int[] nums) {
        int[] tab = new int[90];
        int res = -1;
        for (int num : nums) {
            int i = 0;
            for (int x = num; x > 0; x /= 10) {
                i += x % 10;
            }
            if (tab[i] != 0) {
                res = Math.max(res, num + tab[i]);
            }
            tab[i] = Math.max(tab[i], num);
        }
        return res;
    }

}

package org.huhu.leetcode.n1814;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int countNicePairs(int[] nums) {
        long res = 0;
        Map<Integer, Integer> tab = new HashMap<>();
        for (int num : nums) {
            int rev = 0, x = num;
            while (x > 0) {
                rev *= 10;
                rev += (x % 10);
                x /= 10;
            }
            int k = num - rev;
            int cnt = tab.getOrDefault(k, 0);
            res += cnt;
            tab.put(k, cnt + 1);
        }
        return (int) (res % 1000000007);
    }

}

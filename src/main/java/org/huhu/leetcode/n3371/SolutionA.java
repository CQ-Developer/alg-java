package org.huhu.leetcode.n3371;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int getLargestOutlier(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : nums) {
            cnt.merge(x, 1, Integer::sum);
            sum += x;
        }
        int result = Integer.MIN_VALUE;
        for (int x : nums) {
            if ((sum - x) % 2 == 0) {
                int k = (sum - x) / 2;
                if (cnt.containsKey(k) && (k != x || cnt.get(k) > 1)) {
                    result = Math.max(result, x);
                }
            }
        }
        return result;
    }

}

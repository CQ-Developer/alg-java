package org.huhu.leetcode.n3404;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public long numberOfSubsequences(int[] nums) {
        long cnt = 0;
        int n = nums.length;
        Map<Float, Integer> tab = new HashMap<>();
        for (int c = 4; c < n - 2; c++) {
            float b = nums[c - 2];
            for (int a = 0; a < c - 3; a++) {
                tab.merge(nums[a] / b, 1, Integer::sum);
            }
            float x = nums[c];
            for (int d = c + 2; d < n; d++) {
                cnt += tab.getOrDefault(nums[d] / x, 0);
            }
        }
        return cnt;
    }

}

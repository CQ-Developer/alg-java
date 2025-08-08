package org.huhu.leetcode.interview.n16.n24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public List<List<Integer>> pairSums(int[] nums, int target) {
        Map<Integer, Integer> tab = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int num : nums) {
            int x = target - num;
            if (tab.getOrDefault(x, 0) > 0) {
                result.add(List.of(x, num));
                tab.merge(x, -1, Integer::sum);
            } else {
                tab.merge(num, 1, Integer::sum);
            }
        }
        return result;
    }

}

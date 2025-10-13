package org.huhu.leetcode.n1130;

import java.util.ArrayList;
import java.util.List;

/**
 * 贪心
 */
class SolutionD implements Solution {

    @Override
    public int mctFromLeafValues(int[] arr) {
        List<Integer> nums = new ArrayList<>();
        for (int x : arr) {
            nums.add(x);
        }
        int sum = 0;
        while (nums.size() > 1) {
            int mn = Integer.MAX_VALUE, j = -1;
            for (int i = 0; i < nums.size() - 1; i++) {
                if (nums.get(i) * nums.get(i + 1) < mn) {
                    // 找最小的
                    mn = nums.get(i) * nums.get(i + 1);
                    j = nums.get(i) < nums.get(i + 1) ? i : i + 1;
                }
            }
            sum += mn;
            nums.remove(j);
        }
        return sum;
    }

}

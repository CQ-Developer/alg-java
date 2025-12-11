package org.huhu.leetcode.n454;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    /**
     * nums1[i] + nums2[j] + nums3[k] + nums4[l] = 0
     * 转换为:
     * nums1[i] + nums2[j] = - nums3[k] - nums4[l]
     */
    @Override
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> tab = new HashMap<>();
        for (int x : nums1) {
            for (int y : nums2) {
                tab.merge(x + y, 1, Integer::sum);
            }
        }
        int cnt = 0;
        for (int x : nums3) {
            for (int y : nums4) {
                cnt += tab.getOrDefault(-x - y, 0);
            }
        }
        return cnt;
    }

}

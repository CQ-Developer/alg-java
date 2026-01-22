package org.huhu.leetcode.n2552;

import java.util.Arrays;

class SolutionB implements Solution {

    @Override
    public long countQuadruplets(int[] nums) {
        int n = nums.length;
        int[][] greater = new int[n][];
        greater[n - 1] = new int[n + 1];
        for (int k = n - 2; k > 0; k--) {
            greater[k] = Arrays.copyOf(greater[k + 1], n + 1);
            for (int x = 1; x < nums[k + 1]; x++) {
                greater[k][x]++;
            }
        }
        long ans = 0;
        for (int j = 1; j < n - 2; j++) {
            for (int k = j + 1; k < n - 1; k++) {
                if (nums[j] > nums[k]) {
                    ans += (nums[k] - n + 1 + j + greater[j][nums[k]]) * greater[k][nums[j]];
                }
            }
        }
        return ans;
    }

}

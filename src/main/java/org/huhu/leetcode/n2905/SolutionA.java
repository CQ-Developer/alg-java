package org.huhu.leetcode.n2905;

class SolutionA implements Solution {

    @Override
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n = nums.length, a = 0, b = 0;
        for (int i = indexDifference; i < n; i++) {
            int j = i - indexDifference;
            if (nums[j] < nums[a]) {
                a = j;
            } else if (nums[j] > nums[b]) {
                b = j;
            }
            if (nums[b] - nums[i] >= valueDifference) {
                return new int[]{b, i};
            }
            if (nums[i] - nums[a] >= valueDifference) {
                return new int[]{a, i};
            }
        }
        return new int[]{-1, -1};
    }

}

package org.huhu.leetcode.n540;

class SolutionB implements Solution {

    @Override
    public int singleNonDuplicate(int[] nums) {
        int l = -1, r = nums.length / 2;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (nums[i * 2] != nums[i * 2 + 1]) {
                r = i;
            } else {
                l = i;
            }
        }
        return nums[r * 2];
    }

}

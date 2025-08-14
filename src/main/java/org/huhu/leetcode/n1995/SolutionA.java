package org.huhu.leetcode.n1995;

class SolutionA implements Solution {

    @Override
    public int countQuadruplets(int[] nums) {
        int n = nums.length, cnt = 0;
        for (int a = 0; a < n - 3; a++) {
            for (int b = a + 1; b < n - 2; b++) {
                for (int c = b + 1; c < n - 1; c++) {
                    for (int d = c + 1; d < n; d++) {
                        if (nums[a] + nums[b] + nums[c] == nums[d]) {
                            cnt++;
                        }
                    }
                }
            }
        }
        return cnt;
    }

}

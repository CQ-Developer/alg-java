package org.huhu.leetcode.n1995;

class SolutionC implements Solution {

    @Override
    public int countQuadruplets(int[] nums) {
        int[] tab = new int[401];
        int n = nums.length, cnt = 0;
        for (int b = n - 3; b >= 1; b--) {
            for (int c = b + 1, d = b + 2; d < n; d++) {
                tab[nums[d] - nums[c] + 200]++;
            }
            for (int a = b - 1; a >= 0; a--) {
                cnt += tab[nums[a] + nums[b] + 200];
            }
        }
        return cnt;
    }

}

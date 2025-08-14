package org.huhu.leetcode.n1995;

class SolutionB implements Solution {

    @Override
    public int countQuadruplets(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        int[] tab = new int[301];
        for (int c = n - 2; c >= 2; c--) {
            tab[nums[c + 1]]++;
            for (int b = c - 1; b >= 1; b--) {
                for (int a = b - 1; a >= 0; a--) {
                    cnt += tab[nums[a] + nums[b] + nums[c]];
                }
            }
        }
        return cnt;
    }

}

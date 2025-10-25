package org.huhu.leetcode.n3221;

class SolutionA implements Solution {

    @Override
    public long maxScore(int[] nums) {
        int n = nums.length;

        int k = -1;
        int[] stack = new int[n];
        for (int i = 0; i < n; i++) {
            while (k > -1 && nums[i] >= nums[stack[k]]) {
                k--;
            }
            stack[++k] = i;
        }

        long ans = 0;
        for (int i = 0, p = 0; p <= k; p++) {
            int j = stack[p];
            ans += (j - i) * nums[j];
            i = j;
        }

        return ans;
    }

}

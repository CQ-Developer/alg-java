package org.huhu.leetcode.n3427;

class SolutionA implements Solution {

    @Override
    public int subarraySum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            pre[i + 1] = pre[i] + x;
            sum += pre[i + 1] - pre[Math.max(0, i - x)];
        }
        return sum;
    }

}

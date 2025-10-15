package org.huhu.leetcode.n2289;

/**
 * 单调栈(从右向左)
 */
class SolutionB implements Solution {

    @Override
    public int totalSteps(int[] nums) {
        int n = nums.length;
        int[] steps = new int[n];
        int[] stack = new int[n];
        for (int j = -1, i = n - 1; i > -1; i--) {
            while (j > -1 && nums[i] > nums[stack[j]]) {
                steps[i] = Math.max(steps[stack[j--]], steps[i] + 1);
            }
            stack[++j] = i;
        }
        int mx = 0;
        for (int s : steps) {
            mx = Math.max(mx, s);
        }
        return mx;
    }

}

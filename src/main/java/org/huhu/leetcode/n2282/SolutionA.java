package org.huhu.leetcode.n2282;

import java.util.ArrayDeque;
import java.util.Deque;

class SolutionA implements Solution {

    @Override
    public int[][] seePeople(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        int[][] ans = new int[m][];

        for (int i = 0; i < m; i++) {
            ans[i] = count(heights[i]);
        }

        for (int j = 0; j < n; j++) {
            int[] nums = new int[m];
            for (int i = 0; i < m; i++) {
                nums[i] = heights[i][j];
            }
            int[] cnt = count(nums);
            for (int i = 0; i < m; i++) {
                ans[i][j] += cnt[i];
            }
        }

        return ans;
    }

    private int[] count(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = n - 1; i > -1; i--) {
            while (!stk.isEmpty() && nums[i] > stk.peek()) {
                stk.pop();
                ans[i]++;
            }
            if (!stk.isEmpty()) {
                ans[i]++;
            }
            while (!stk.isEmpty() && nums[i] == stk.peek()) {
                stk.poll();
            }
            stk.push(nums[i]);
        }
        return ans;
    }

}

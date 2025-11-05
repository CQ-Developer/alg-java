package org.huhu.leetcode.n42;

class SolutionA implements Solution {

    @Override
    public int trap(int[] height) {
        int n = height.length;
        int[] suf = new int[n];
        suf[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = Math.max(suf[i + 1], height[i]);
        }
        int water = 0;
        int[] pre = new int[n];
        pre[0] = height[0];
        for (int i = 1; i < n; i++) {
            pre[i] = Math.max(pre[i - 1], height[i]);
            water += Math.min(pre[i], suf[i]) - height[i];
        }
        return water;
    }

}

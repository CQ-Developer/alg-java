package org.huhu.leetcode.n42;

class SolutionB implements Solution {

    @Override
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0, pre = 0, suf = 0;
        int l = 0, r = n - 1;
        while (l < r) {
            pre = Math.max(pre, height[l]);
            suf = Math.max(suf, height[r]);
            if (pre < suf) {
                ans += pre - height[l++];
            } else {
                ans += suf - height[r--];
            }
        }
        return ans;
    }

}

package org.huhu.leetcode.n2454;

import java.util.Arrays;

class SolutionB implements Solution {

    @Override
    public int[] secondGreaterElement(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        int[] s1 = new int[n], s2 = new int[n];
        for (int a = -1, b = -1, i = 0; i < n; i++) {
            while (b >= 0 && nums[i] > nums[s2[b]]) {
                arr[s2[b--]] = nums[i];
            }
            int c = a;
            while (a >= 0 && nums[i] > nums[s1[a]]) {
                a--;
            }
            for (int j = a + 1; j <= c; j++) {
                s2[++b] = s1[j];
            }
            s1[++a] = i;
        }
        return arr;
    }

}

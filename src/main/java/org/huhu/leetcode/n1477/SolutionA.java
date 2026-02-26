package org.huhu.leetcode.n1477;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int minSumOfLength(int[] arr, int target) {
        int n = arr.length;
        int ans = n + 1;

        // dp[i]表示[0...i)中和为target的子数组的最短长度
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n);

        // 前缀和
        int pre = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < n; i++) {
            pre += arr[i];
            Integer j = map.get(pre - target);
            if (j == null) {
                dp[i + 1] = dp[i];
            } else {
                ans = Math.min(ans, i - j + dp[j + 1]);
                dp[i + 1] = Math.min(dp[i], i - j);
            }
            map.put(pre, i);
        }
        return ans == n + 1 ? -1 : ans;
    }

}

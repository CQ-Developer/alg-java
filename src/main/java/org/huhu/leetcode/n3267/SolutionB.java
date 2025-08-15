package org.huhu.leetcode.n3267;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class SolutionB implements Solution {

    private static final int[] p = { 1, 10, 100, 1000, 10000, 100000, 1000000 };

    @Override
    public int countPairs(int[] nums) {
        int cnt = 0;
        Arrays.sort(nums);
        int[] num = new int[7];
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            Set<Integer> set = new HashSet<>();
            set.add(x);
            cnt += map.getOrDefault(x, 0);
            int n = 0;
            for (int v = x; v > 0; v /= 10) {
                num[n++] = v % 10;
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (num[i] == num[j]) {
                        continue;
                    }
                    int y = x + (num[j] - num[i]) * (p[i] - p[j]);
                    if (set.add(y)) {
                        cnt += map.getOrDefault(y, 0);
                    }
                    swap(num, i, j);
                    for (int k = i + 1; k < n - 1; k++) {
                        for (int l = k + 1; l < n; l++) {
                            int z = y + (num[k] - num[l]) * (p[l] - p[k]);
                            if (set.add(z)) {
                                cnt += map.getOrDefault(z, 0);
                            }
                        }
                    }
                    swap(num, i, j);
                }
            }
            map.merge(x, 1, Integer::sum);
        }
        return cnt;
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}

package org.huhu.leetcode.n3267;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class SolutionA implements Solution {

    @Override
    public int countPairs(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> tab = new HashMap<>();
        int cnt = 0;
        for (int num : nums) {
            Set<Integer> set = new HashSet<>();
            set.add(num);
            char[] chars = String.valueOf(num).toCharArray();
            int n = chars.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    swap(chars, i, j);
                    set.add(Integer.valueOf(String.valueOf(chars)));
                    for (int p = i + 1; p < n - 1; p++) {
                        for (int q = p + 1; q < n; q++) {
                            swap(chars, p, q);
                            set.add(Integer.valueOf(String.valueOf(chars)));
                            swap(chars, p, q);
                        }
                    }
                    swap(chars, i, j);
                }
            }
            for (int k : set) {
                cnt += tab.getOrDefault(k, 0);
            }
            tab.merge(num, 1, Integer::sum);
            set.clear();
        }
        return cnt;
    }

    private void swap(char[] chars, int i, int j) {
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }

}

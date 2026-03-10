package org.huhu.leetcode.n1442;

import java.util.HashMap;
import java.util.Map;

class SolutionD implements Solution {

    @Override
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int xor = 0, ans = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        Map<Integer, Integer> total = new HashMap<>();
        for (int i = 0; i < n; i++) {
            cnt.merge(xor, 1, Integer::sum);
            total.merge(xor, i, Integer::sum);
            xor ^= arr[i];
            ans += i * cnt.getOrDefault(xor, 0) - total.getOrDefault(xor, 0);
        }
        return ans;
    }

}

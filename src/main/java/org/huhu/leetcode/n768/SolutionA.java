package org.huhu.leetcode.n768;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] sorted = Arrays.copyOf(arr, n);
        Arrays.sort(sorted);
        int cnt = 0;
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = arr[i], y = sorted[i];
            counter.merge(x, 1, Integer::sum);
            counter.merge(y, -1, Integer::sum);
            counter.remove(x, 0);
            counter.remove(y, 0);
            if (counter.isEmpty()) {
                cnt++;
            }
        }
        return cnt;
    }

}

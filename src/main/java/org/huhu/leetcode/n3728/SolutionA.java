package org.huhu.leetcode.n3728;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    record Pre(int x, long p) {
    }

    @Override
    public long countStableSubarrays(int[] capacity) {
        /*
         * capacity[l] = capacity[r] = pre[r] - pre[l+1]
         * 
         *            capacity[l] = capacity[r]
         * capacity[l] + pre[l+1] = pre[r]
         */
        Map<Pre, Integer> cnt = new HashMap<>();
        long p = capacity[0], ans = 0;
        for (int r = 1; r < capacity.length; r++) {
            ans += cnt.getOrDefault(new Pre(capacity[r], p), 0);
            cnt.merge(new Pre(capacity[r - 1], capacity[r - 1] + p), 1, Integer::sum);
            p += capacity[r];
        }
        return ans;
    }

}

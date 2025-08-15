package org.huhu.leetcode.n3267;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

class SolutionC implements Solution {

    private static final int[] P = { 1, 10, 100, 1000, 10000, 100000, 1000000 };

    @Override
    public int countPairs(int[] nums) {
        int mx = 0;
        for (int num : nums) {
            mx = Math.max(mx, num);
        }
        int n = nums.length, m = String.valueOf(mx).length();
        int cnt = 0;
        int[] digit = new int[m];
        Map<Integer, BitSet> map = new HashMap<>();
        for (int pos = 0; pos < n; pos++) {
            int x = nums[pos];
            var bs = new BitSet();
            if (map.containsKey(x)) {
                bs.or(map.get(x));
            } else {
                map.put(x, new BitSet());
            }
            map.get(x).set(pos);
            for (int i = 0, v = x; i < m; i++, v /= 10) {
                digit[i] = v % 10;
            }
            for (int i = 0; i < m - 1; i++) {
                for (int j = i + 1; j < m; j++) {
                    if (digit[i] != digit[j]) {
                        int y = x + (digit[j] - digit[i]) * (P[i] - P[j]);
                        if (map.containsKey(y)) {
                            bs.or(map.get(y));
                        } else {
                            map.put(y, new BitSet());
                        }
                        map.get(y).set(pos);
                    }
                }
            }
            cnt += bs.cardinality();
        }
        return cnt;
    }

}

package org.huhu.leetcode.n3714;

import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int longestBalanced(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int longest = 0;
        // 1 letter
        for (int i = 0; i < n;) {
            int j = i++;
            while (i < n && c[j] == c[i]) {
                i++;
            }
            longest = Math.max(longest, i - j);
        }
        // 2 letters
        longest = Math.max(longest, f(c, n, 'a', 'b'));
        longest = Math.max(longest, f(c, n, 'b', 'c'));
        longest = Math.max(longest, f(c, n, 'c', 'a'));
        // 3 letters
        Map<Long, Integer> map = new HashMap<>();
        map.put((long) n << 17 | n, -1);
        int[] cnt = new int[3];
        for (int i = 0; i < n; i++) {
            cnt[c[i] - 'a']++;
            long p = (long) (cnt[1] - cnt[0] + n) << 17 | (cnt[2] - cnt[1] + n);
            Integer j = map.putIfAbsent(p, i);
            if (j != null) {
                longest = Math.max(longest, i - j);
            }
        }
        return longest;
    }

    private int f(char[] c, int n, char x, char y) {
        int longest = 0;
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, i - 1);
            for (int d = 0; i < n && (c[i] == x || c[i] == y); i++) {
                d += c[i] == x ? 1 : -1;
                Integer j = map.putIfAbsent(d, i);
                if (j != null) {
                    longest = Math.max(longest, i - j);
                }
            }
        }
        return longest;
    }

}

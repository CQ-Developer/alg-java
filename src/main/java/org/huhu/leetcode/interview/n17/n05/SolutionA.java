package org.huhu.leetcode.interview.n17.n05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public String[] findLongestSubarray(String[] array) {
        int pos = 0, len = 0, pre = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        cnt.put(0, -1);
        for (int i = 0; i < array.length; i++) {
            // 数字 0011xxxx
            // 字母 01xxxxxx
            pre += (array[i].charAt(0) >> 6 & 1) * 2 - 1;
            Integer j = cnt.get(pre);
            if (j != null) {
                int n = i - j;
                if (n > len) {
                    pos = j;
                    len = n;
                }
            } else {
                cnt.put(pre, i);
            }
        }
        return Arrays.copyOfRange(array, pos + 1, pos + 1 + len);
    }

}

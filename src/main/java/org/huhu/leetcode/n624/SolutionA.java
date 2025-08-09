package org.huhu.leetcode.n624;

import java.util.List;

class SolutionA implements Solution {

    @Override
    public int maxDistance(List<List<Integer>> arrays) {
        int result = 0;
        int mn = arrays.getFirst().getFirst(), mx = arrays.getFirst().getLast();
        for (List<Integer> arr : arrays.subList(1, arrays.size())) {
            int a = arr.getFirst(), b = arr.getLast();
            result = Math.max(result, Math.max(b - mn, mx - a));
            mn = Math.min(mn, a);
            mx = Math.max(mx, b);
        }
        return result;
    }

}

package org.huhu.leetcode.n1534;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionC implements Solution {

    @Override
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, (i, j) -> arr[i] - arr[j]);
        int cnt = 0;
        for (int j : idx) {
            List<Integer> left = new ArrayList<>();
            for (int i : idx) {
                if (i < j && Math.abs(arr[i] - arr[j]) <= a) {
                    left.add(arr[i]);
                }
            }
            List<Integer> right = new ArrayList<>();
            for (int k : idx) {
                if (k > j && Math.abs(arr[j] - arr[k]) <= b) {
                    right.add(arr[k]);
                }
            }
            int p1 = 0, p2 = 0;
            for (int x : left) {
                while (p2 < right.size() && right.get(p2) <= x + c) {
                    p2++;
                }
                while (p1 < right.size() && right.get(p1) < x - c) {
                    p1++;
                }
                cnt += p2 - p1;
            }
        }
        return cnt;
    }

}

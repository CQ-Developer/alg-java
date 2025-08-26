package org.huhu.leetcode.n496;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class SolutionA implements Solution {

    @Override
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        for (int i = nums2.length - 1; i >= 0; i--) {
            int x = nums2[i];
            while (stack.size() > 1 && x >= stack.peek()) {
                stack.pop();
            }
            map.put(x, stack.peek());
            stack.push(x);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }

}

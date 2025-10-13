package org.huhu.leetcode.n2454;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

class SolutionA implements Solution {

    @Override
    public int[] secondGreaterElement(int[] nums) {
        Queue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        Deque<Integer> stack = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        for (int i = 0; i < n; i++) {
            while (!heap.isEmpty() && nums[i] > heap.peek()[0]) {
                res[heap.poll()[1]] = nums[i];
            }
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int j = stack.pop();
                heap.offer(new int[] { nums[j], j });
            }
            stack.push(i);
        }
        return res;
    }

}

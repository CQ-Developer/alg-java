package org.huhu.leetcode.n853;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class SolutionA implements Solution {

    @Override
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][];
        for (int i = 0; i < n; i++) {
            cars[i] = new int[] { position[i], speed[i] };
        }
        Arrays.sort(cars, (a, b) -> a[0] - b[0]);
        Deque<Double> stack = new ArrayDeque<>();
        for (int[] car : cars) {
            double time = (double) (target - car[0]) / car[1];
            while (!stack.isEmpty() && time >= stack.peek()) {
                // 左侧车辆花费更少时间到达终点
                // 那么这些车一定会和当前车辆相遇并加入当前车所在的车队
                stack.pop();
            }
            stack.push(time);
        }
        return stack.size();
    }

}

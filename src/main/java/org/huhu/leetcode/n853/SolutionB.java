package org.huhu.leetcode.n853;

import java.util.Arrays;

class SolutionB implements Solution {

    @Override
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][];
        for (int i = 0; i < n; i++) {
            cars[i] = new int[] { position[i], speed[i] };
        }
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);
        int cnt = 0;
        float pre = 0;
        for (int[] car : cars) {
            float time = (float) (target - car[0]) / car[1];
            // 花费时间大于右侧车辆, 不可能和右侧车辆组成车队
            if (time > pre) {
                cnt++;
                pre = time;
            }
        }
        return cnt;
    }

}

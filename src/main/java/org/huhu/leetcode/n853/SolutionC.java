package org.huhu.leetcode.n853;

class SolutionC implements Solution {

    @Override
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        // 使用数组替换排序操作
        float[] times = new float[target];
        for (int i = 0; i < n; i++) {
            times[position[i]] = (float) (target - position[i]) / speed[i];
        }
        int cnt = 0;
        float pre = 0;
        for (int i = target - 1; i >= 0; i--) {
            if (times[i] > pre) {
                cnt++;
                pre = times[i];
            }
        }
        return cnt;
    }

}

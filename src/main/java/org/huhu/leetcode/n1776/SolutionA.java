package org.huhu.leetcode.n1776;

/**
 * 单调栈
 */
class SolutionA implements Solution {

    /**
     * 观察cars[i]和cars[j]的关系
     * 如果i<j且speed[i]>speed[j], 那么cars[i]会追上cars[j]并形成车队.
     * 可以理解为cars[i]消失了, cars[j]不发生任何变化.
     * 那么每辆车只需要关注其右侧的车辆即可.
     */
    @Override
    public double[] getCollisionTimes(int[][] cars) {
        int n = cars.length;
        double[] times = new double[n];
        int[] stack = new int[n];
        // 从右向左遍历
        for (int j = -1, i = n - 1; i > -1; i--) {
            while (j > -1) {
                // 如果当前车速小于栈顶车速
                // 那么当前车辆不可能追上栈顶车辆, 栈顶车辆会加入它右侧的车队
                // 当前车辆可以追它右侧的车队
                if (cars[i][1] <= cars[stack[j]][1]) {
                    j--;
                }
                // 当前车速大于栈顶车速
                else {
                    // 栈顶车辆不会加入右侧车队, 必然能追上
                    if (times[stack[j]] == -1) {
                        break;
                    }
                    // 栈顶车辆会加入右侧车队
                    // 那么在它加入右侧车队前, 当前车辆能否追上它
                    double dis = times[stack[j]] * (cars[i][1] - cars[stack[j]][1]);
                    // 能追上
                    if (dis > cars[stack[j]][0] - cars[i][0]) {
                        break;
                    }
                    // 追不上, 那么栈顶车辆会加入它右侧的车队
                    // 当前车辆可以追它右侧的车队
                    else {
                        j--;
                    }
                }
            }
            // 右侧没有车队
            // 当前车辆不可能加入任何车队
            if (j == -1) {
                times[i] = -1;
            }
            // 计算当前车辆加入右侧车队花费的时间
            else {
                times[i] = (double) (cars[stack[j]][0] - cars[i][0]) / (cars[i][1] - cars[stack[j]][1]);
            }
            stack[++j] = i;
        }
        return times;
    }

}

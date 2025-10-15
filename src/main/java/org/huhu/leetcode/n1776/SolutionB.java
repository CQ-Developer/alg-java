package org.huhu.leetcode.n1776;

class SolutionB implements Solution {

    @Override
    public double[] getCollisionTimes(int[][] cars) {
        int n = cars.length;
        double[] times = new double[n];
        times[n - 1] = -1;
        int[] stack = new int[n];
        stack[0] = n - 1;
        for (int s = 0, i = n - 2; i > -1; i--) {
            times[i] = -1;
            while (s > -1) {
                int j = stack[s];
                if (cars[i][1] <= cars[j][1]) {
                    s--;
                } else {
                    double cost = (double) (cars[j][0] - cars[i][0]) / (cars[i][1] - cars[j][1]);
                    if (times[j] != -1 && cost >= times[j]) {
                        s--;
                    } else {
                        times[i] = cost;
                        break;
                    }
                }
            }
            stack[++s] = i;
        }
        return times;
    }

}

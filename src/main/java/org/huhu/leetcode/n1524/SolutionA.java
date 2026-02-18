package org.huhu.leetcode.n1524;

class SolutionA implements Solution {

    @Override
    public int numOfSubarrays(int[] arr) {
        long cnt = 0;
        int pre = 0, odd = 0, even = 1;
        for (int x : arr) {
            pre += x;
            if (pre % 2 == 0) {
                // 偶数
                even++;
                cnt += odd;
            } else {
                // 奇数
                odd++;
                cnt += even;
            }
        }
        return (int) (cnt % 1000000007);
    }

}

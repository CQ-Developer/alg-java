package org.huhu.leetcode.n682;

class SolutionB implements Solution {

    @Override
    public int calPoints(String[] operations) {
        int i = 0, n = operations.length;
        int[] nums = new int[n];
        for (String s : operations) {
            if (s.equals("C")) {
                nums[i - 1] = 0;
                i--;
            } else if (s.equals("D")) {
                nums[i] = nums[i - 1] * 2;
                i++;
            } else if (s.equals("+")) {
                nums[i] = nums[i - 1] + nums[i - 2];
                i++;
            } else {
                nums[i] = Integer.parseInt(s);
                i++;
            }
        }
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        return sum;
    }

}

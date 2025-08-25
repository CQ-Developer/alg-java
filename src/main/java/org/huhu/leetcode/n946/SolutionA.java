package org.huhu.leetcode.n946;

class SolutionA implements Solution {

    @Override
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        int i = 0, j = 0;
        int[] stack = new int[n];
        for (int x : pushed) {
            stack[i++] = x;
            while (i > 0 && stack[i - 1] == popped[j]) {
                i--;
                j++;
            }
        }
        return i == 0;
    }

}

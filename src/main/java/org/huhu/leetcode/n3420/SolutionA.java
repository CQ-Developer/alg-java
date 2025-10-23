package org.huhu.leetcode.n3420;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/**
 * 从左向右遍历
 */
class SolutionA implements Solution {

    @Override
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        int[] posR = new int[n];
        Arrays.fill(posR, n);
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            while (!st.isEmpty() && x >= nums[st.peek()]) {
                posR[st.pop()] = i;
            }
            // 循环结束: 栈顶就是位于x左侧大于x的最近元素
            if (!st.isEmpty()) {
                g.get(st.peek()).add(i);
            }
            st.push(i);
        }
        int cnt = 0;
        long ans = 0;
        // 使用单调队列维护最大值
        Deque<Integer> q = new ArrayDeque<>();
        for (int l = 0, r = 0; r < n; r++) {
            int x = nums[r];
            // x进入窗口维护窗口的单调性
            while (!q.isEmpty() && x >= nums[q.peekLast()]) {
                q.pollLast();
            }
            q.addLast(r);
            // x进入窗口后操作次数需要增加: 队首为窗口的最大值 - x
            cnt += nums[q.peekFirst()] - x;
            // 操作次数过多缩小窗口
            while (cnt > k) {
                int out = nums[l];
                for (int i : g.get(l)) {
                    if (i > r) {
                        // 不在窗口内
                        break;
                    }
                    cnt -= (out - nums[i]) * (Math.min(posR[i], r + 1) - i);
                }
                l++;
                // 队首元素离开窗口
                if (!q.isEmpty() && q.peekFirst() < l) {
                    q.pollFirst();
                }
            }
            // 右端点固定在r的情况下: 窗口内的子数组数量
            ans += r - l + 1;
        }
        return ans;
    }

}

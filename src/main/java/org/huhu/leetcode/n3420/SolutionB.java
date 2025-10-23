package org.huhu.leetcode.n3420;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 从右向左
 */
class SolutionB implements Solution {

    @Override
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        long ans = 0, cnt = 0;
        Deque<int[]> q = new ArrayDeque<>();
        for (int r = n - 1, l = n - 1; l >= 0; l--) {
            int x = nums[l], sz = 1;
            while (!q.isEmpty() && x >= q.peekFirst()[0]) {
                int[] tree = q.pollFirst();
                sz += tree[1];
                cnt += (long) (x - tree[0]) * tree[1];
            }
            q.offerFirst(new int[] { x, sz });
            while (cnt > k) {
                int[] tree = q.peekLast();
                cnt -= tree[0] - nums[r];
                r--;
                tree[1]--;
                if (tree[1] == 0) {
                    q.pollLast();
                }
            }
            ans += r - l + 1;
        }
        return ans;
    }

}

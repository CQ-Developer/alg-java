package org.huhu.leetcode.n1631;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class SolutionC implements Solution {

	private static final int[][] D = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	@Override
	public int minimumEffortPath(int[][] heights) {
		int m = heights.length, n = heights[0].length;
		boolean[][] visited = new boolean[m][n];
		int[][] efforts = new int[m][n];
		for (int[] d : efforts) {
			Arrays.fill(d, Integer.MAX_VALUE);
		}
		efforts[0][0] = 0;
		Queue<int[]> heap = new PriorityQueue<>((a, b) -> a[2] - b[2]);
		heap.offer(new int[] { 0, 0, 0 });
		while (!heap.isEmpty()) {
			int[] cur = heap.poll();
			int i = cur[0], j = cur[1];
			if (!visited[i][j]) {
				visited[i][j] = true;
				for (int[] d : D) {
					int x = i + d[0], y = j + d[1];
					if (x >= 0 && x < m && y >= 0 && y < n) {
						efforts[x][y] = Math.min(efforts[x][y], Math.max(efforts[i][j], Math.abs(heights[i][j] - heights[x][y])));
						heap.offer(new int[] { x, y, efforts[x][y] });
					}
				}
			}
		}
		return efforts[m - 1][n - 1];
	}

}

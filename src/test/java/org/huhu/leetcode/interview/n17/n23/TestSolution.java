package org.huhu.leetcode.interview.n17.n23;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void testA() {
        int[][] matrix = { { 1, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } };
        int[] arr = { 1, 0, 2 };
        Assertions.assertThat(solution.findSquare(matrix)).containsExactly(arr);
    }

    @Test
    void testB() {
        int[][] matrix = { { 0, 1, 1 }, { 1, 0, 1 }, { 1, 1, 0 } };
        int[] arr = { 0, 0, 1 };
        Assertions.assertThat(solution.findSquare(matrix)).containsExactly(arr);
    }

}

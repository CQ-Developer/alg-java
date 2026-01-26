package org.huhu.leetcode.n3446;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        int[][] grid = new int[][] { { 1, 7, 3 }, { 9, 8, 2 }, { 4, 5, 6 } };
        int[][] actual = solution.sortMatrix(grid);
        int[][] expect = new int[][] { { 8, 2, 3 }, { 9, 6, 7 }, { 4, 5, 1 } };
        Assertions.assertThat(actual).isDeepEqualTo(expect);
    }

    @Test
    void test_b() {
        int[][] grid = new int[][] { { 0, 1 }, { 1, 2 } };
        int[][] actual = solution.sortMatrix(grid);
        int[][] expect = new int[][] { { 2, 1 }, { 1, 0 } };
        Assertions.assertThat(actual).isDeepEqualTo(expect);
    }

    @Test
    void test_c() {
        int[][] grid = new int[][] { { 1 } };
        int[][] actual = solution.sortMatrix(grid);
        int[][] expect = new int[][] { { 1 } };
        Assertions.assertThat(actual).isDeepEqualTo(expect);
    }

}

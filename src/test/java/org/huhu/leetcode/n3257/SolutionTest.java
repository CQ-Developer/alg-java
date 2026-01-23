package org.huhu.leetcode.n3257;

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
        int[][] board = new int[][] { { -3, 1, 1, 1 }, { -3, 1, -3, 1 }, { -3, 2, 1, 1 } };
        long ans = solution.maximumValueSum(board);
        Assertions.assertThat(ans).isEqualTo(4);
    }

    @Test
    void test_b() {
        int[][] board = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        long ans = solution.maximumValueSum(board);
        Assertions.assertThat(ans).isEqualTo(15);
    }

    @Test
    void test_c() {
        int[][] board = new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        long ans = solution.maximumValueSum(board);
        Assertions.assertThat(ans).isEqualTo(3);
    }

    @Test
    void test_d() {
        int[][] board = new int[][] { { -46, -9, 28 }, { 34, -74, -25 }, { -62, -73, -68 } };
        long ans = solution.maximumValueSum(board);
        Assertions.assertThat(ans).isEqualTo(-11);
    }

    @Test
    void test_e() {
        int[][] board = new int[][] { { 70, -16, 31 }, { 2, 75, 37 }, { 67, -95, -44 } };
        long ans = solution.maximumValueSum(board);
        Assertions.assertThat(ans).isEqualTo(173);
    }

    @Test
    void test_f() {
        int[][] board = new int[][] { { -58, 44, -82 }, { 91, -54, 38 }, { 65, 73, 10 } };
        long ans = solution.maximumValueSum(board);
        Assertions.assertThat(ans).isEqualTo(147);
    }

}

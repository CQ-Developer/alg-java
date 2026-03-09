package org.huhu.leetcode.n1074;

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
    void test_a() {
        int[][] matrix = { { 0, 1, 0 }, { 1, 1, 1 }, { 0, 1, 0 } };
        Assertions.assertThat(solution.numSubmatrixSumTarget(matrix, 0)).isEqualTo(4);
    }

    @Test
    void test_b() {
        int[][] matrix = { { 1, -1 }, { -1, 1 } };
        Assertions.assertThat(solution.numSubmatrixSumTarget(matrix, 0)).isEqualTo(5);
    }

    @Test
    void test_c() {
        int[][] matrix = { { 904 } };
        Assertions.assertThat(solution.numSubmatrixSumTarget(matrix, 0)).isEqualTo(0);
    }

}

package org.huhu.leetcode.n1310;

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
        int[] arr = { 1, 3, 4, 8 };
        int[][] queries = { { 0, 1 }, { 1, 2 }, { 0, 3 }, { 3, 3 } };
        int[] expect = { 2, 7, 14, 8 };
        Assertions.assertThat(solution.xorQueries(arr, queries)).containsOnly(expect);
    }

    @Test
    void testB() {
        int[] arr = { 4, 8, 2, 10 };
        int[][] queries = { { 2, 3 }, { 1, 3 }, { 0, 0 }, { 0, 3 } };
        int[] expect = { 8, 0, 4, 4 };
        Assertions.assertThat(solution.xorQueries(arr, queries)).containsOnly(expect);
    }

}

package org.huhu.leetcode.n498;

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
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] expect = { 1, 2, 4, 7, 5, 3, 6, 8, 9 };
        Assertions.assertThat(solution.findDiagonalOrder(mat)).containsExactly(expect);
    }

    @Test
    void testB() {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int[] expect = { 1, 2, 3, 4 };
        Assertions.assertThat(solution.findDiagonalOrder(mat)).containsExactly(expect);
    }

}

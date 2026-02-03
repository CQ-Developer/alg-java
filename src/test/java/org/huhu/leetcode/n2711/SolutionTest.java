package org.huhu.leetcode.n2711;

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
    void testA() {
        int[][] g = { { 1, 2, 3 }, { 3, 1, 5 }, { 3, 2, 1 } };
        int[][] expect = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 1, 1 } };
        Assertions.assertThat(solution.differenceOfDistinctValues(g)).isDeepEqualTo(expect);
    }

    @Test
    void testB() {
        int[][] g = { { 1 } };
        int[][] expect = { { 0 } };
        Assertions.assertThat(solution.differenceOfDistinctValues(g)).isDeepEqualTo(expect);
    }

}

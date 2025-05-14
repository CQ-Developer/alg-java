package org.huhu.leetcode.n1631;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void test_1() {
        int[][] heights = { { 1, 2, 2 }, { 3, 8, 2 }, { 5, 3, 5 } };
        assertEquals(2, solution.minimumEffortPath(heights));
    }

    @Test
    void test_2() {
        int[][] heights = { { 1, 2, 3 }, { 3, 8, 4 }, { 5, 3, 5 } };
        assertEquals(1, solution.minimumEffortPath(heights));
    }

    @Test
    void test_3() {
        int[][] heights = { { 1, 2, 1, 1, 1 }, { 1, 2, 1, 2, 1 }, { 1, 2, 1, 2, 1 }, { 1, 2, 1, 2, 1 }, { 1, 1, 1, 2, 1 } };
        assertEquals(0, solution.minimumEffortPath(heights));
    }

}

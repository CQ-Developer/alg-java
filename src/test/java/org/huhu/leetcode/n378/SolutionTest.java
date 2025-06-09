package org.huhu.leetcode.n378;

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
        int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        assertEquals(13, solution.kthSmallest(matrix, 8));
    }

    void test_2() {
        int[][] matrix = { { -5 } };
        assertEquals(-5, solution.kthSmallest(matrix, 1));
    }

}

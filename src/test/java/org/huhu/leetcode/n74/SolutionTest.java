package org.huhu.leetcode.n74;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution generate();

    @BeforeEach
    void setup() {
        solution = generate();
    }

    @Test
    void test1() {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        assertTrue(solution.searchMatrix(matrix, 3));
    }

    @Test
    void test2() {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        assertFalse(solution.searchMatrix(matrix, 13));
    }

}

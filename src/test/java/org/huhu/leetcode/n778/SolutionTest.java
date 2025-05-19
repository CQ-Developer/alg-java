package org.huhu.leetcode.n778;

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
        int[][] grid = { { 0, 2 }, { 1, 3 } };
        assertEquals(3, solution.swimInWater(grid));
    }

    @Test
    void test_2() {
        int[][] grid = { { 0, 1, 2, 3, 4 }, { 24, 23, 22, 21, 5 }, { 12, 13, 14, 15, 16 }, { 11, 17, 18, 19, 20 }, { 10, 9, 8, 7, 6 } };
        assertEquals(16, solution.swimInWater(grid));
    }

    @Test
    void test_3() {
        int[][] grid = { { 11, 15, 3, 2 }, { 6, 4, 0, 13 }, { 5, 8, 9, 10 }, { 1, 14, 12, 7 } };
        assertEquals(11, solution.swimInWater(grid));
    }

}

package org.huhu.leetcode.n3464;

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
        int[][] points = { { 0, 2 }, { 2, 0 }, { 2, 2 }, { 0, 0 } };
        assertEquals(2, solution.maxDistance(2, points, 4));
    }

    @Test
    void test_2() {
        int[][] points = { { 0, 0 }, { 1, 2 }, { 2, 0 }, { 2, 2 }, { 2, 1 } };
        assertEquals(1, solution.maxDistance(2, points, 4));
    }

    @Test
    void test_3() {
        int[][] points = { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 2 }, { 2, 0 }, { 2, 2 }, { 2, 1 } };
        assertEquals(1, solution.maxDistance(2, points, 5));
    }

}

package org.huhu.leetcode.n3449;

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
        int[] points = { 2, 4 };
        assertEquals(4, solution.maxScore(points, 3));
    }

    @Test
    void test_2() {
        int[] points = { 1, 2, 3 };
        assertEquals(2, solution.maxScore(points, 5));
    }

}

package org.huhu.leetcode.lcp.n12;

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
        int[] times = { 1, 2, 3, 3 };
        assertEquals(3, solution.minTime(times, 2));
    }

    @Test
    void test_2() {
        int[] times = { 999, 999, 999 };
        assertEquals(0, solution.minTime(times, 4));
    }

    @Test
    void test_3() {
        int[] times = { 1, 2, 3, 3, 3 };
        assertEquals(3, solution.minTime(times, 2));
    }

}

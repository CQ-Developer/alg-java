package org.huhu.leetcode.n2528;

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
        int[] stations = { 1, 2, 4, 5, 0 };
        assertEquals(5, solution.maxPower(stations, 1, 2));
    }

    @Test
    void test_2() {
        int[] stations = { 4, 4, 4, 4 };
        assertEquals(4, solution.maxPower(stations, 0, 3));
    }

}

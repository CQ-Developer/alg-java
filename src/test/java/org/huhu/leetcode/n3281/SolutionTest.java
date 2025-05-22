package org.huhu.leetcode.n3281;

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
        int[] start = { 6, 0, 3 };
        assertEquals(4, solution.maxPossibleScore(start, 2));
    }

    @Test
    void test_2() {
        int[] start = { 2, 6, 13, 13 };
        assertEquals(5, solution.maxPossibleScore(start, 5));
    }

    @Test
    void test_3() {
        int[] start = { 1000000000, 0 };
        assertEquals(2000000000, solution.maxPossibleScore(start, 1000000000));
    }

    @Test
    void test_4() {
        int[] start = { 0, 9, 2, 9 };
        assertEquals(2, solution.maxPossibleScore(start, 2));
    }

}

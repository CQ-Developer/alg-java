package org.huhu.leetcode.n1201;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution geSolution();

    @BeforeEach
    void setup() {
        solution = geSolution();
    }

    @Test
    void test_1() {
        assertEquals(4, solution.nthUglyNumber(3, 2, 3, 5));
    }

    @Test
    void test_2() {
        assertEquals(6, solution.nthUglyNumber(4, 2, 3, 4));
    }

    @Test
    void test_3() {
        assertEquals(10, solution.nthUglyNumber(5, 2, 11, 13));
    }

}

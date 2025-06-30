package org.huhu.leetcode.n69;

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
    void test1() {
        assertEquals(2, solution.mySqrt(4));
    }

    @Test
    void test2() {
        assertEquals(2, solution.mySqrt(8));
    }

}

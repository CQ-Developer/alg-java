package org.huhu.leetcode.n793;

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
        assertEquals(5, solution.preimageSizeFZF(0));
    }

    @Test
    void test_2() {
        assertEquals(0, solution.preimageSizeFZF(5));
    }

    @Test
    void test_3() {
        assertEquals(5, solution.preimageSizeFZF(3));
    }

}

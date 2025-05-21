package org.huhu.leetcode.n3399;

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
        assertEquals(2, solution.minLength("000001", 1));
    }

    @Test
    void test_2() {
        assertEquals(1, solution.minLength("0000", 2));
    }

    @Test
    void test_3() {
        assertEquals(1, solution.minLength("0101", 0));
    }

}

package org.huhu.leetcode.n2513;

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
        assertEquals(4, solution.minimizeSet(2, 7, 1, 3));
    }

    @Test
    void test_2() {
        assertEquals(3, solution.minimizeSet(3, 5, 2, 1));
    }

    @Test
    void test_3() {
        assertEquals(15, solution.minimizeSet(2, 4, 8, 2));
    }

}

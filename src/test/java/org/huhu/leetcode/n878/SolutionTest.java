package org.huhu.leetcode.n878;

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
        assertEquals(2, solution.nthMagicalNumber(1, 2, 3));
    }

    @Test
    void test_2() {
        assertEquals(6, solution.nthMagicalNumber(4, 2, 3));
    }

}

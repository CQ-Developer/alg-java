package org.huhu.leetcode.n786;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        this.solution = getSolution();
    }

    @Test
    void test_1() {
        assertArrayEquals(new int[] { 2, 5 }, this.solution.kthSmallestPrimeFraction(new int[] { 1, 2, 3, 5 }, 3));
    }

    @Test
    void test_2() {
        assertEquals(new int[] { 1, 7 }, this.solution.kthSmallestPrimeFraction(new int[] { 1, 7 }, 1));
    }

}

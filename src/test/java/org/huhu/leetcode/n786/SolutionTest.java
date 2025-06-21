package org.huhu.leetcode.n786;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
        assertArrayEquals(new int[] { 1, 7 }, this.solution.kthSmallestPrimeFraction(new int[] { 1, 7 }, 1));
    }

    @Test
    void test_3() {
        assertArrayEquals(new int[] { 23, 47 }, solution.kthSmallestPrimeFraction(new int[] { 1, 7, 23, 29, 47 }, 8));
    }

}

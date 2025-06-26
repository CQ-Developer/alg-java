package org.huhu.leetcode.n1508;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution instance();

    @BeforeEach
    void setup() {
        this.solution = instance();
    }

    @Test
    void test1() {
        assertEquals(13, this.solution.rangeSum(new int[] { 1, 2, 3, 4 }, 4, 1, 5));
    }

    @Test
    void test2() {
        assertEquals(6, this.solution.rangeSum(new int[] { 1, 2, 3, 4 }, 4, 3, 4));
    }

    @Test
    void test3() {
        assertEquals(50, this.solution.rangeSum(new int[] { 1, 2, 3, 4 }, 4, 1, 10));
    }

}

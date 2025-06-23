package org.huhu.leetcode.n3116;

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
        assertEquals(9, solution.findKthSmallest(new int[] { 3, 6, 9 }, 3));
    }

    @Test
    void test2() {
        assertEquals(12, solution.findKthSmallest(new int[] { 5, 2 }, 7));
    }

    @Test
    void test3() {
        assertEquals(35, solution.findKthSmallest(new int[] { 5 }, 7));
    }

}

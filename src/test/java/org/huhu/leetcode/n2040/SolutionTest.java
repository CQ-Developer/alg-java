package org.huhu.leetcode.n2040;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution geSolution();

    @BeforeEach
    void setup() {
        this.solution = geSolution();
    }

    @Test
    void test1() {
        assertEquals(8, this.solution.kthSmallestProduct(new int[] { 2, 5 }, new int[] { 3, 4 }, 2));
    }

    @Test
    void test2() {
        assertEquals(0, this.solution.kthSmallestProduct(new int[] { -4, -2, 0, 3 }, new int[] { 2, 4 }, 6));
    }

    @Test
    void test3() {
        assertEquals(-6, this.solution.kthSmallestProduct(new int[] { -2, -1, 0, 1, 2 }, new int[] { -3, -1, 2, 4, 5 }, 3));
    }

}

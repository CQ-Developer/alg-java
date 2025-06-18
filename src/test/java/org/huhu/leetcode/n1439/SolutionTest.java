package org.huhu.leetcode.n1439;

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
        int[][] mat = { { 1, 3, 11 }, { 2, 4, 6 } };
        assertEquals(7, solution.kthSmallest(mat, 5));
    }

    @Test
    void test2() {
        int[][] mat = { { 1, 3, 11 }, { 2, 4, 6 } };
        assertEquals(17, solution.kthSmallest(mat, 9));
    }

    @Test
    void test3() {
        int[][] mat = { { 1, 10, 10 }, { 1, 4, 5 }, { 2, 3, 6 } };
        assertEquals(9, solution.kthSmallest(mat, 7));
    }

    @Test
    void test4() {
        int[][] mat = { { 1, 1, 10 }, { 2, 2, 9 } };
        assertEquals(12, solution.kthSmallest(mat, 7));
    }

}

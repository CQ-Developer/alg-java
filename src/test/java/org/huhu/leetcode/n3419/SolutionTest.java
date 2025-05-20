package org.huhu.leetcode.n3419;

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
        int[][] edges = { { 1, 0, 1 }, { 2, 0, 2 }, { 3, 0, 1 }, { 4, 3, 1 }, { 2, 1, 1 } };
        assertEquals(1, solution.minMaxWeight(5, edges, 2));
    }

    @Test
    void test_2() {
        int[][] edges = { { 0, 1, 1 }, { 0, 2, 2 }, { 0, 3, 1 }, { 0, 4, 1 }, { 1, 2, 1 }, { 1, 4, 1 } };
        assertEquals(-1, solution.minMaxWeight(5, edges, 1));
    }

    @Test
    void test_3() {
        int[][] edges = { { 1, 2, 1 }, { 1, 3, 3 }, { 1, 4, 5 }, { 2, 3, 2 }, { 3, 4, 2 }, { 4, 0, 1 } };
        assertEquals(2, solution.minMaxWeight(5, edges, 1));
    }

    @Test
    void test_4() {
        int[][] edges = { { 1, 2, 1 }, { 1, 3, 3 }, { 1, 4, 5 }, { 2, 3, 2 }, { 4, 0, 1 } };
        assertEquals(-1, solution.minMaxWeight(5, edges, 1));
    }

}

package org.huhu.leetcode.n1552;

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
        int[] position = { 1, 2, 3, 4, 7 };
        assertEquals(3, solution.maxDistance(position, 3));
    }

    @Test
    void test_2() {
        int[] position = { 5, 4, 3, 2, 1, 1000000000 };
        assertEquals(999999999, solution.maxDistance(position, 2));
    }

}

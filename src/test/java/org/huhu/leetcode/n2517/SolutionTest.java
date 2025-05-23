package org.huhu.leetcode.n2517;

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
        int[] price = { 13, 5, 1, 8, 21, 2 };
        assertEquals(8, solution.maximumTastiness(price, 3));
    }

    @Test
    void test_2() {
        int[] price = { 1, 3, 1 };
        assertEquals(2, solution.maximumTastiness(price, 2));
    }

    @Test
    void test_3() {
        int[] price = { 7, 7, 7, 7 };
        assertEquals(0, solution.maximumTastiness(price, 2));
    }

}

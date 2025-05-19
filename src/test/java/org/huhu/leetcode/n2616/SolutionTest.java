package org.huhu.leetcode.n2616;

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
        int[] nums = { 10, 1, 2, 7, 1, 3 };
        assertEquals(1, solution.minimizeMax(nums, 2));
    }

    @Test
    void test_2() {
        int[] nums = { 4, 2, 1, 2 };
        assertEquals(0, solution.minimizeMax(nums, 1));
    }

    @Test
    void test_3() {
        int[] nums = { 0, 5, 3, 4 };
        assertEquals(0, solution.minimizeMax(nums, 0));
    }

    @Test
    void test_4() {
        int[] nums = { 10, 1, 2, 7, 1, 3 };
        assertEquals(0, solution.minimizeMax(nums, 0));
    }

    @Test
    void test_5() {
        int[] nums = { 3, 4, 2, 3, 2, 1, 2 };
        assertEquals(1, solution.minimizeMax(nums, 3));
    }

}

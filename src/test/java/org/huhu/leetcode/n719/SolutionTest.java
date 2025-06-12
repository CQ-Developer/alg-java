package org.huhu.leetcode.n719;

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
        int[] nums = { 1, 3, 1 };
        assertEquals(0, solution.smallestDistancePair(nums, 1));
    }

    @Test
    void test_2() {
        int[] nums = { 1, 1, 1 };
        assertEquals(0, solution.smallestDistancePair(nums, 2));
    }

    @Test
    void test_3() {
        int[] nums = { 1, 6, 1 };
        assertEquals(5, solution.smallestDistancePair(nums, 3));
    }

}

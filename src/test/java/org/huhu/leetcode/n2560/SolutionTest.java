package org.huhu.leetcode.n2560;

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
        int[] nums = { 2, 3, 5, 9 };
        assertEquals(5, solution.minCapability(nums, 2));
    }

    @Test
    void test_2() {
        int[] nums = { 2, 7, 9, 3, 1 };
        assertEquals(2, solution.minCapability(nums, 2));
    }

}

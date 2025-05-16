package org.huhu.leetcode.n2439;

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
        int[] nums = { 3, 7, 1, 6 };
        assertEquals(5, solution.minimizeArrayValue(nums));
    }

    @Test
    void test_2() {
        int[] nums = { 10, 1 };
        assertEquals(10, solution.minimizeArrayValue(nums));
    }

}

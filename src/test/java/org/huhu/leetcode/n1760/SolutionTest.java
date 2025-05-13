package org.huhu.leetcode.n1760;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void test_1() {
        int[] nums = { 9 };
        Assertions.assertEquals(3, solution.minimumSize(nums, 2));
    }

    @Test
    void test_2() {
        int[] nums = { 2, 4, 8, 2 };
        Assertions.assertEquals(2, solution.minimumSize(nums, 4));
    }

    @Test
    void test_3() {
        int[] nums = { 7, 17 };
        Assertions.assertEquals(7, solution.minimumSize(nums, 2));
    }

}

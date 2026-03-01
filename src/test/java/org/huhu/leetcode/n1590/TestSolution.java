package org.huhu.leetcode.n1590;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        int[] nums = { 3, 1, 4, 2 };
        Assertions.assertThat(solution.minSubarray(nums, 6)).isEqualTo(1);
    }

    @Test
    void test_b() {
        int[] nums = { 6, 3, 5, 2 };
        Assertions.assertThat(solution.minSubarray(nums, 9)).isEqualTo(2);
    }

    @Test
    void test_c() {
        int[] nums = { 1, 2, 3 };
        Assertions.assertThat(solution.minSubarray(nums, 3)).isEqualTo(0);
    }

}

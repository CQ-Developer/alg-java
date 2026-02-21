package org.huhu.leetcode.n523;

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
    void testA() {
        int[] nums = { 23, 2, 4, 6, 7 };
        Assertions.assertThat(solution.checkSubarraySum(nums, 6)).isTrue();
    }

    @Test
    void testB() {
        int[] nums = { 23, 2, 6, 4, 7 };
        Assertions.assertThat(solution.checkSubarraySum(nums, 6)).isTrue();
    }

    @Test
    void testC() {
        int[] nums = { 23, 2, 6, 4, 7 };
        Assertions.assertThat(solution.checkSubarraySum(nums, 13)).isFalse();
    }

    @Test
    void testD() {
        int[] nums = { 23, 2, 4, 6, 6 };
        Assertions.assertThat(solution.checkSubarraySum(nums, 7)).isTrue();
    }

    @Test
    void testE() {
        int[] nums = { 0 };
        Assertions.assertThat(solution.checkSubarraySum(nums, 1)).isFalse();
    }

}

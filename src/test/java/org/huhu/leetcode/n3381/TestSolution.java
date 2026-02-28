package org.huhu.leetcode.n3381;

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
        int[] nums = { 1, 2 };
        Assertions.assertThat(solution.maxSubarraySum(nums, 1)).isEqualTo(3);
    }

    @Test
    void testB() {
        int[] nums = { -1, -2, -3, -4, -5 };
        Assertions.assertThat(solution.maxSubarraySum(nums, 4)).isEqualTo(-10);
    }

    @Test
    void testC() {
        int[] nums = { -5, 1, 2, -3, 4 };
        Assertions.assertThat(solution.maxSubarraySum(nums, 2)).isEqualTo(4);
    }

}

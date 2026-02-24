package org.huhu.leetcode.n3026;

import org.assertj.core.api.Assertions;
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
    void testA() {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        Assertions.assertThat(solution.maximumSubarraySum(nums, 1)).isEqualTo(11);
    }

    @Test
    void testB() {
        int[] nums = { -1, 3, 2, 4, 5 };
        Assertions.assertThat(solution.maximumSubarraySum(nums, 3)).isEqualTo(11);
    }

    @Test
    void testC() {
        int[] nums = { -1, -2, -3, -4 };
        Assertions.assertThat(solution.maximumSubarraySum(nums, 2)).isEqualTo(-6);
    }

}

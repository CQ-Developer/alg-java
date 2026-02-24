package org.huhu.leetcode.n3755;

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
        int[] nums = { 3, 1, 3, 2, 0 };
        Assertions.assertThat(solution.maxBalancedSubarray(nums)).isEqualTo(4);
    }

    @Test
    void testB() {
        int[] nums = { 3, 2, 8, 5, 4, 14, 9, 15 };
        Assertions.assertThat(solution.maxBalancedSubarray(nums)).isEqualTo(8);
    }

    @Test
    void testC() {
        int[] nums = { 0 };
        Assertions.assertThat(solution.maxBalancedSubarray(nums)).isEqualTo(0);
    }

}

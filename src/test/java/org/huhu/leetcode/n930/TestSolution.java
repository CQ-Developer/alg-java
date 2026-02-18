package org.huhu.leetcode.n930;

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
        int[] nums = { 1, 0, 1, 0, 1 };
        Assertions.assertThat(solution.numSubarraysWithSum(nums, 2)).isEqualTo(4);
    }

    @Test
    void testB() {
        int[] nums = { 0, 0, 0, 0, 0 };
        Assertions.assertThat(solution.numSubarraysWithSum(nums, 0)).isEqualTo(15);
    }

}

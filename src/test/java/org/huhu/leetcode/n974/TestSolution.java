package org.huhu.leetcode.n974;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class TestSolution {

    Solution solution;

    abstract Solution geSolution();

    @BeforeEach
    void setup() {
        solution = geSolution();
    }

    @Test
    void testA() {
        int[] nums = { 4, 5, 0, -2, -3, 1 };
        Assertions.assertThat(solution.subarraysDivByK(nums, 5)).isEqualTo(7);
    }

    @Test
    void testB() {
        int[] nums = { 5 };
        Assertions.assertThat(solution.subarraysDivByK(nums, 9)).isZero();
    }

}

package org.huhu.leetcode.n1749;

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
        int[] nums = { 1, -3, 2, 3, -4 };
        Assertions.assertThat(solution.maxAbsoluteSum(nums)).isEqualTo(5);
    }

    @Test
    void testB() {
        int[] nums = { 2, -5, 1, -4, 3, -2 };
        Assertions.assertThat(solution.maxAbsoluteSum(nums)).isEqualTo(8);
    }

}

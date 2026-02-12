package org.huhu.leetcode.n53;

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
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        Assertions.assertThat(solution.maxSubArray(nums)).isEqualTo(6);
    }

    @Test
    void testB() {
        int[] nums = { 5, 4, -1, 7, 8 };
        Assertions.assertThat(solution.maxSubArray(nums)).isEqualTo(23);
    }

}

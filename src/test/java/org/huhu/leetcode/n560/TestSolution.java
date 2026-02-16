package org.huhu.leetcode.n560;

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
        int[] nums = { 1, 1, 1 };
        Assertions.assertThat(solution.subarraySum(nums, 2)).isEqualTo(2);
    }

    @Test
    void testB() {
        int[] nums = { 1, 2, 3 };
        Assertions.assertThat(solution.subarraySum(nums, 3)).isEqualTo(2);
    }

}

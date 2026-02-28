package org.huhu.leetcode.n2488;

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
        int[] nums = { 3, 2, 1, 4, 5 };
        Assertions.assertThat(solution.countSubarrays(nums, 4)).isEqualTo(3);
    }

    @Test
    void testB() {
        int[] nums = { 2, 3, 1 };
        Assertions.assertThat(solution.countSubarrays(nums, 3)).isEqualTo(1);
    }

}

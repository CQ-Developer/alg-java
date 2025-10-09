package org.huhu.leetcode.n3113;

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
    void test_1() {
        int[] nums = { 1, 4, 3, 3, 2 };
        Assertions.assertThat(solution.numberOfSubarrays(nums)).isEqualTo(6);
    }

    @Test
    void test_2() {
        int[] nums = { 3, 3, 3 };
        Assertions.assertThat(solution.numberOfSubarrays(nums)).isEqualTo(6);
    }

    @Test
    void test_3() {
        int[] nums = { 1 };
        Assertions.assertThat(solution.numberOfSubarrays(nums)).isEqualTo(1);
    }

}

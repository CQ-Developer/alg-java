package org.huhu.leetcode.n3739;

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
    void test_a() {
        int[] nums = { 1, 2, 2, 3 };
        Assertions.assertThat(solution.countMajoritySubarrys(nums, 2)).isEqualTo(5);
    }

    @Test
    void test_b() {
        int[] nums = { 1, 1, 1, 1 };
        Assertions.assertThat(solution.countMajoritySubarrys(nums, 1)).isEqualTo(10);
    }

    @Test
    void test_c() {
        int[] nums = { 1, 2, 3 };
        Assertions.assertThat(solution.countMajoritySubarrys(nums, 4)).isEqualTo(0);
    }

}

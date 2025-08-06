package org.huhu.leetcode.n2815;

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
    void test1() {
        int[] nums = { 51, 71, 17, 24, 42 };
        Assertions.assertThat(solution.maxSum(nums)).isEqualTo(88);
    }

    @Test
    void test2() {
        int[] nums = { 1, 2, 3, 4 };
        Assertions.assertThat(solution.maxSum(nums)).isEqualTo(-1);
    }

    @Test
    void test3() {
        int[] nums = { 112, 131, 411 };
        Assertions.assertThat(solution.maxSum(nums)).isEqualTo(-1);
    }

    @Test
    void test4() {
        int[] nums = { 2536, 1613, 3366, 162 };
        Assertions.assertThat(solution.maxSum(nums)).isEqualTo(5902);
    }

}

package org.huhu.leetcode.n2342;

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
    void test1() {
        int[] nums = {18, 43, 36, 13, 7};
        Assertions.assertThat(solution.maximumSum(nums)).isEqualTo(54);
    }

    @Test
    void test2() {
        int[] nums = {10, 12, 19, 14};
        Assertions.assertThat(solution.maximumSum(nums)).isEqualTo(-1);
    }

}
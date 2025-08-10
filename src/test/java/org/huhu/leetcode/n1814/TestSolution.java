package org.huhu.leetcode.n1814;

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
        int[] nums = { 42, 11, 1, 97 };
        Assertions.assertThat(solution.countNicePairs(nums)).isEqualTo(2);
    }

    @Test
    void test2() {
        int[] nums = { 13, 10, 35, 24, 76 };
        Assertions.assertThat(solution.countNicePairs(nums)).isEqualTo(4);
    }

}

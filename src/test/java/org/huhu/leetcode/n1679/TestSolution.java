package org.huhu.leetcode.n1679;

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
        int[] nums = {1, 2, 3, 4};
        Assertions.assertThat(solution.maxOperations(nums, 5)).isEqualTo(2);
    }

    @Test
    void test2() {
        int[] nums = {3, 1, 3, 4, 3};
        Assertions.assertThat(solution.maxOperations(nums, 6)).isEqualTo(1);
    }

}

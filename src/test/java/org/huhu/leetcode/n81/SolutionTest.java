package org.huhu.leetcode.n81;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test1() {
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        assertThat(solution.search(nums, 0)).isTrue();
    }

    @Test
    void test2() {
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        assertThat(solution.search(nums, 3)).isFalse();
    }

}

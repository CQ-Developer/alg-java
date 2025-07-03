package org.huhu.leetcode.n154;

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
        int[] nums = { 1, 3, 5 };
        assertThat(solution.findMin(nums)).isEqualTo(1);
    }

    @Test
    void test2() {
        int[] nums = { 2, 2, 2, 0, 1 };
        assertThat(solution.findMin(nums)).isEqualTo(0);
    }

}

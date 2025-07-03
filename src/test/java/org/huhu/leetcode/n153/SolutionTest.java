package org.huhu.leetcode.n153;

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
        int[] nums = { 3, 4, 5, 1, 2 };
        assertThat(solution.findMin(nums)).isEqualTo(1);
    }

    @Test
    void test2() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        assertThat(solution.findMin(nums)).isEqualTo(0);
    }

    @Test
    void test3() {
        int[] nums = { 11, 13, 15, 17 };
        assertThat(solution.findMin(nums)).isEqualTo(11);
    }

}

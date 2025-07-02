package org.huhu.leetcode.n162;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution instance();

    @BeforeEach
    void setup() {
        solution = instance();
    }

    @Test
    void test1() {
        int[] nums = { 1, 2, 3, 1 };
        assertThat(solution.findPeakElement(nums)).isEqualTo(2);
    }

    @Test
    void test2() {
        int[] nums = { 1, 2, 1, 3, 5, 6, 4 };
        assertThat(solution.findPeakElement(nums)).isIn(1, 5);
    }

}

package org.huhu.leetcode.n2016;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test1() {
        int[] nums = {7, 1, 5, 4};
        assertThat(solution.maximumDifference(nums)).isEqualTo(4);
    }

    @Test
    void test2() {
        int[] nums = {9, 4, 3, 2};
        assertThat(solution.maximumDifference(nums)).isEqualTo(-1);
    }

    @Test
    void test3() {
        int[] nums = {1, 5, 2, 10};
        assertThat(solution.maximumDifference(nums)).isEqualTo(9);
    }

}

package org.huhu.leetcode.n3371;

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
        int[] nums = { 2, 3, 5, 10 };
        assertThat(solution.getLargestOutlier(nums)).isEqualTo(10);
    }

    @Test
    void test2() {
        int[] nums = { -2, -1, -3, -6, 4 };
        assertThat(solution.getLargestOutlier(nums)).isEqualTo(4);
    }

    @Test
    void test3() {
        int[] nums = { 1, 1, 1, 1, 1, 5, 5 };
        assertThat(solution.getLargestOutlier(nums)).isEqualTo(5);
    }

}

package org.huhu.leetcode.n33;

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
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        assertThat(solution.search(nums, 0)).isEqualTo(4);
    }

    @Test
    void test2() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        assertThat(solution.search(nums, 3)).isEqualTo(-1);
    }

    @Test
    void test3() {
        int[] nums = { 1 };
        assertThat(solution.search(nums, 0)).isEqualTo(-1);
    }

}

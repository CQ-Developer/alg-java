package org.huhu.leetcode.n3584;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test1() {
        int[] nums = {-1, -9, 2, 3, -2, -3, 1};
        assertThat(solution.maximumProduct(nums, 1)).isEqualTo(81);
    }

    @Test
    void test2() {
        int[] nums = {1, 3, -5, 5, 6, -4};
        assertThat(solution.maximumProduct(nums, 3)).isEqualTo(20);
    }

    @Test
    void test3() {
        int[] nums = {2, -1, 2, -6, 5, 2, -5, 7};
        assertThat(solution.maximumProduct(nums, 2)).isEqualTo(35);
    }

}

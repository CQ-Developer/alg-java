package org.huhu.leetcode.n219;

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
        int[] nums = {1, 2, 3, 1};
        assertThat(solution.containsNearbyDuplicate(nums, 3)).isTrue();
    }

    @Test
    void test2() {
        int[] nums = {1, 0, 1, 1};
        assertThat(solution.containsNearbyDuplicate(nums, 1)).isTrue();
    }

    @Test
    void test3() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        assertThat(solution.containsNearbyDuplicate(nums, 2)).isFalse();
    }

}

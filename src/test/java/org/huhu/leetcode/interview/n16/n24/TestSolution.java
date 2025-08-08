package org.huhu.leetcode.interview.n16.n24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        int[] nums = {5, 6, 5};
        assertThat(solution.pairSums(nums, 11)).isEqualTo(List.of(List.of(5, 6)));
    }

    @Test
    void test2() {
        int[] nums = {5, 6, 5, 6};
        assertThat(solution.pairSums(nums, 11)).isEqualTo(List.of(List.of(5, 6), List.of(5, 6)));
    }

}

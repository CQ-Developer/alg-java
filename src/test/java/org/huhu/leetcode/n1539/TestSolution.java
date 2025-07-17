package org.huhu.leetcode.n1539;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test1() {
        int[] arr = { 2, 3, 4, 7, 11 };
        assertThat(solution.findKthPositive(arr, 5)).isEqualTo(9);
    }

    @Test
    void test2() {
        int[] arr = { 1, 2, 3, 4 };
        assertThat(solution.findKthPositive(arr, 2)).isEqualTo(6);
    }

}

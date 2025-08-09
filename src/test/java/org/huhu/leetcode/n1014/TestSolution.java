package org.huhu.leetcode.n1014;

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
        int[] values = { 8, 1, 5, 2, 6 };
        assertThat(solution.maxScoreSightseeingPair(values)).isEqualTo(11);
    }

    @Test
    void test2() {
        int[] values = { 1, 2 };
        assertThat(solution.maxScoreSightseeingPair(values)).isEqualTo(2);
    }

    @Test
    void test3() {
        int[] values = { 1, 3, 5 };
        assertThat(solution.maxScoreSightseeingPair(values)).isEqualTo(7);
    }

}

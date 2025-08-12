package org.huhu.leetcode.n3185;

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
        int[] hours = {12, 12, 30, 24, 24};
        assertThat(solution.countCompleteDayPairs(hours)).isEqualTo(2);
    }

    @Test
    void test2() {
        int[] hours = {72, 48, 24, 3};
        assertThat(solution.countCompleteDayPairs(hours)).isEqualTo(3);
    }

}
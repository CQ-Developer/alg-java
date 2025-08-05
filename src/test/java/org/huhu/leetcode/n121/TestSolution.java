package org.huhu.leetcode.n121;

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
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertThat(solution.maxProfit(prices)).isEqualTo(5);
    }

    @Test
    void test2() {
        int[] prices = {7, 6, 4, 3, 1};
        assertThat(solution.maxProfit(prices)).isEqualTo(0);
    }

}
package org.huhu.leetcode.n3652;

import org.assertj.core.api.Assertions;
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
    void testA() {
        int[] prices = { 4, 2, 8 };
        int[] strategy = { -1, 0, 1 };
        Assertions.assertThat(solution.maxProfit(prices, strategy, 2)).isEqualTo(10);
    }

    @Test
    void testB() {
        int[] prices = { 5, 4, 3 };
        int[] strategy = { 1, 1, 0 };
        Assertions.assertThat(solution.maxProfit(prices, strategy, 2)).isEqualTo(9);
    }

}

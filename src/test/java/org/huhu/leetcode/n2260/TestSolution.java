package org.huhu.leetcode.n2260;

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
    void test1() {
        int[] cards = {3, 4, 2, 3, 4, 7};
        Assertions.assertThat(solution.minimumCardPickup(cards)).isEqualTo(4);
    }

    @Test
    void test2() {
        int[] cards = {1, 0, 5, 3};
        Assertions.assertThat(solution.minimumCardPickup(cards)).isEqualTo(-1);
    }

}

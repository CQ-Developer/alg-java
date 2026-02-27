package org.huhu.leetcode.n3728;

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
        int[] capacity = { 9, 3, 3, 3, 9 };
        Assertions.assertThat(solution.countStableSubarrays(capacity)).isEqualTo(2);
    }

    @Test
    void testB() {
        int[] capacity = { 1, 2, 3, 4, 5 };
        Assertions.assertThat(solution.countStableSubarrays(capacity)).isEqualTo(0);
    }

    @Test
    void testC() {
        int[] capacity = { -4, 4, 0, 0, -8, -4 };
        Assertions.assertThat(solution.countStableSubarrays(capacity)).isEqualTo(1);
    }

}

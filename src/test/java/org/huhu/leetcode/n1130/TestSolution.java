package org.huhu.leetcode.n1130;

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
    void testA() {
        int[] arr = { 6, 2, 4 };
        assertThat(solution.mctFromLeafValues(arr)).isEqualTo(32);
    }

    @Test
    void testB() {
        int[] arr = { 4, 11 };
        assertThat(solution.mctFromLeafValues(arr)).isEqualTo(44);
    }

}

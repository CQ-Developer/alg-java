package org.huhu.leetcode.n1524;

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
        int[] arr = { 1, 3, 5 };
        Assertions.assertThat(solution.numOfSubarrays(arr)).isEqualTo(4);
    }

    @Test
    void testB() {
        int[] arr = { 2, 4, 6 };
        Assertions.assertThat(solution.numOfSubarrays(arr)).isEqualTo(0);
    }

    @Test
    void testC() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        Assertions.assertThat(solution.numOfSubarrays(arr)).isEqualTo(16);
    }

}

package org.huhu.leetcode.n1477;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void testA() {
        int[] arr = { 3, 2, 2, 4, 3 };
        Assertions.assertThat(solution.minSumOfLength(arr, 3)).isEqualTo(2);
    }

    @Test
    void testB() {
        int[] arr = { 7, 3, 4, 7 };
        Assertions.assertThat(solution.minSumOfLength(arr, 7)).isEqualTo(2);
    }

    @Test
    void testC() {
        int[] arr = { 4, 3, 2, 6, 2, 3, 4 };
        Assertions.assertThat(solution.minSumOfLength(arr, 6)).isEqualTo(-1);
    }

}

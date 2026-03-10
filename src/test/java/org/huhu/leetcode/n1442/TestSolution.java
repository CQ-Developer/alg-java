package org.huhu.leetcode.n1442;

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
    void test_a() {
        int[] arr = { 2, 3, 1, 6, 7 };
        Assertions.assertThat(solution.countTriplets(arr)).isEqualTo(4);
    }

    @Test
    void test_b() {
        int[] arr = { 1, 1, 1, 1, 1 };
        Assertions.assertThat(solution.countTriplets(arr)).isEqualTo(10);
    }

}

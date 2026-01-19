package org.huhu.leetcode.n2552;

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
        Assertions.assertThat(solution.countQuadruplets(new int[] { 1, 3, 2, 4, 5 })).isEqualTo(2);
    }

    @Test
    void test_b() {
        Assertions.assertThat(solution.countQuadruplets(new int[] { 1, 2, 3, 4 })).isEqualTo(0);
    }

}

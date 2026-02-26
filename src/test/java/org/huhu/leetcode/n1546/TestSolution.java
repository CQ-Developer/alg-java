package org.huhu.leetcode.n1546;

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
        int[] nums = { 1, 1, 1, 1, 1 };
        Assertions.assertThat(solution.maxNonOverlapping(nums, 2)).isEqualTo(2);
    }

    @Test
    void testB() {
        int[] nums = { -1, 3, 5, 1, 4, 2, -9 };
        Assertions.assertThat(solution.maxNonOverlapping(nums, 6)).isEqualTo(2);
    }

}

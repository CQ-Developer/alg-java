package org.huhu.leetcode.n2588;

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
        int[] nums = { 4, 3, 1, 2, 4 };
        Assertions.assertThat(solution.beautifulSubarrays(nums)).isEqualTo(2);
    }

    @Test
    void testB() {
        int[] nums = { 1, 10, 4 };
        Assertions.assertThat(solution.beautifulSubarrays(nums)).isEqualTo(0);
    }

}

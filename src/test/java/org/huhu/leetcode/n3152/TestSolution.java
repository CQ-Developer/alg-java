package org.huhu.leetcode.n3152;

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
        int[] nums = { 3, 4, 1, 2, 6 };
        int[][] queires = { { 0, 4 } };
        boolean[] expect = { false };
        Assertions.assertThat(solution.isArraySpecial(nums, queires)).containsExactly(expect);
    }

    @Test
    void testB() {
        int[] nums = { 4, 3, 1, 6 };
        int[][] queires = { { 0, 2 }, { 2, 3 } };
        boolean[] expect = { false, true };
        Assertions.assertThat(solution.isArraySpecial(nums, queires)).containsExactly(expect);
    }

}

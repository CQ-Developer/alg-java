package org.huhu.leetcode.n1944;

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
        int[] heights = { 10, 6, 8, 5, 11, 9 };
        int[] actual = solution.canSeePersonsCount(heights);
        assertThat(actual).containsExactly(3, 1, 2, 1, 1, 0);
    }

    @Test
    void testB() {
        int[] heights = { 5, 1, 2, 3, 10 };
        int[] actual = solution.canSeePersonsCount(heights);
        assertThat(actual).contains(4, 1, 1, 1, 0);
    }

    @Test
    void testC() {
        int[] heights = { 3, 1, 5, 8, 6 };
        int[] actual = solution.canSeePersonsCount(heights);
        assertThat(actual).contains(2, 1, 1, 1, 0);
    }

}

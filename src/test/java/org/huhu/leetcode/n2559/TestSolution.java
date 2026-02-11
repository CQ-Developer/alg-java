package org.huhu.leetcode.n2559;

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
        String[] words = { "aba", "bcb", "ece", "aa", "e" };
        int[][] queries = { { 0, 2 }, { 1, 4 }, { 1, 1 } };
        int[] ans = { 2, 3, 0 };
        Assertions.assertThat(solution.vowelStrings(words, queries)).containsExactly(ans);
    }

    @Test
    void testB() {
        String[] words = { "a", "e", "i" };
        int[][] queries = { { 0, 2 }, { 0, 1 }, { 2, 2 } };
        int[] ans = { 3, 2, 1 };
        Assertions.assertThat(solution.vowelStrings(words, queries)).containsExactly(ans);
    }

}

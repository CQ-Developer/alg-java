package org.huhu.leetcode.n1901;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution instance();

    @BeforeEach
    void setup() {
        solution = instance();
    }

    @Test
    void test1() {
        int[][] mat = { { 1, 4 }, { 3, 2 } };
        assertThat(solution.findPeakGrid(mat)).containsExactly(0, 1);
    }

    @Test
    void test2() {
        int[][] mat = { { 10, 20, 15 }, { 21, 30, 14 }, { 7, 16, 32 } };
        assertThat(solution.findPeakGrid(mat)).containsExactly(1, 1);
    }

}

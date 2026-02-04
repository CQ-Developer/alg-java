package org.huhu.leetcode.n1329;

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
        int[][] mat = {
                { 3, 3, 1, 1 },
                { 2, 2, 1, 2 },
                { 1, 1, 1, 2 }
        };
        int[][] expect = {
                { 1, 1, 1, 1 },
                { 1, 2, 2, 2 },
                { 1, 2, 3, 3 }
        };
        Assertions.assertThat(solution.diagonalSort(mat)).isDeepEqualTo(expect);
    }

    @Test
    void testB() {
        int[][] mat = {
                { 11, 25, 66, 1, 69, 7 },
                { 23, 55, 17, 45, 15, 52 },
                { 75, 31, 36, 44, 58, 8 },
                { 22, 27, 33, 25, 68, 4 },
                { 84, 28, 14, 11, 5, 50 }
        };
        int[][] expect = {
                { 5, 17, 4, 1, 52, 7 },
                { 11, 11, 25, 45, 8, 69 },
                { 14, 23, 25, 44, 58, 15 },
                { 22, 27, 31, 36, 50, 66 },
                { 84, 28, 75, 33, 55, 68 }
        };
        Assertions.assertThat(solution.diagonalSort(mat)).isDeepEqualTo(expect);
    }

}

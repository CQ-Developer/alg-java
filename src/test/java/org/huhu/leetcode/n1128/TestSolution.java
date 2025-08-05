package org.huhu.leetcode.n1128;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test1() {
        int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        assertThat(solution.numEquivDominoPairs(dominoes)).isEqualTo(1);
    }

    @Test
    void test2() {
        int[][] dominoes = {{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}};
        assertThat(solution.numEquivDominoPairs(dominoes)).isEqualTo(3);
    }

}

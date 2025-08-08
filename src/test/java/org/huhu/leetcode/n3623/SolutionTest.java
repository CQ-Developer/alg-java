package org.huhu.leetcode.n3623;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test1() {
        int[][] points = {{1, 0}, {2, 0}, {3, 0}, {2, 2}, {3, 2}};
        assertThat(solution.countTrapezoids(points)).isEqualTo(3);
    }

    @Test
    void test2() {
        int[][] points = {{0, 0}, {1, 0}, {0, 1}, {2, 1}};
        assertThat(solution.countTrapezoids(points)).isEqualTo(1);
    }

}
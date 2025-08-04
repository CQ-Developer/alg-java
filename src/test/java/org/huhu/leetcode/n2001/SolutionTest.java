package org.huhu.leetcode.n2001;

import static org.assertj.core.api.Assertions.assertThat;

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
    void test1() {
        int[][] rectangles = { { 4, 8 }, { 3, 6 }, { 10, 20 }, { 15, 30 } };
        assertThat(solution.interchangeableRectangles(rectangles)).isEqualTo(6);
    }

    @Test
    void test2() {
        int[][] rectangles = { { 4, 5 }, { 7, 8 } };
        assertThat(solution.interchangeableRectangles(rectangles)).isEqualTo(0);
    }

}

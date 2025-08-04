package org.huhu.leetcode.n2441;

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
        assertThat(solution.findMaxK(new int[]{-1, 2, -3, 3})).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(solution.findMaxK(new int[]{-1, 10, 6, 7, -7, 1})).isEqualTo(7);
    }

    @Test
    void test3() {
        assertThat(solution.findMaxK(new int[]{-10, 8, 6, 7, -2, -3})).isEqualTo(-1);
    }

}

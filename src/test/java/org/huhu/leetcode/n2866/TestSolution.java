package org.huhu.leetcode.n2866;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

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
    void test_1() {
        assertThat(solution.maximumSumOfHeights(List.of(5, 3, 4, 1, 1))).isEqualTo(13);
    }

    @Test
    void test_2() {
        assertThat(solution.maximumSumOfHeights(List.of(6, 5, 3, 9, 2, 7))).isEqualTo(22);
    }

    @Test
    void test_3() {
        assertThat(solution.maximumSumOfHeights(List.of(3, 2, 5, 5, 2, 3))).isEqualTo(18);
    }

}

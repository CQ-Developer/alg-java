package org.huhu.leetcode.n624;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

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
        List<List<Integer>> arrays = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(1, 2, 3));
        assertThat(solution.maxDistance(arrays)).isEqualTo(4);
    }

    @Test
    void test2() {
        List<List<Integer>> arrays = List.of(
                List.of(1),
                List.of(1));
        assertThat(solution.maxDistance(arrays)).isEqualTo(0);
    }

}

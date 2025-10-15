package org.huhu.leetcode.n1776;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void test(int[][] cars, double[] result) {
        Assertions.assertThat(solution.getCollisionTimes(cars)).containsExactly(result);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[][] { { 1, 2 }, { 2, 1 }, { 4, 3 }, { 7, 2 } }, new double[] { 1, -1, 3, -1 }),
                Arguments.of(new int[][] { { 3, 4 }, { 5, 4 }, { 6, 3 }, { 9, 1 } }, new double[] { 2, 1, 1.5, -1 }));
    }

}

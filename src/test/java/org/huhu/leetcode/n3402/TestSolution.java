package org.huhu.leetcode.n3402;

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
    @MethodSource("data")
    void test(int[][] grid, int expected) {
        Assertions.assertThat(solution.minimumOperations(grid)).isEqualTo(expected);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[][] { { 3, 2 }, { 1, 3 }, { 3, 4 }, { 0, 1 } }, 15),
                Arguments.of(new int[][] { { 3, 2, 1 }, { 2, 1, 0 }, { 1, 2, 3 } }, 12)
        );
    }

}

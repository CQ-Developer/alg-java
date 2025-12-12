package org.huhu.leetcode.n3548;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(int[][] grid, boolean ans) {
        Assertions.assertThat(solution.canPartitionGrid(grid)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(Arguments.of(new int[][] { { 1, 4 }, { 2, 3 } }, true),
                Arguments.of(new int[][] { { 1, 2 }, { 3, 4 } }, true),
                Arguments.of(new int[][] { { 1, 2, 4 }, { 2, 3, 5 } }, false),
                Arguments.of(new int[][] { { 4, 1, 8 }, { 3, 2, 6 } }, false));
    }

}

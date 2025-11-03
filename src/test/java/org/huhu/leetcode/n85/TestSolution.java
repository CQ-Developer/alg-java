package org.huhu.leetcode.n85;

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
    void test(char[][] matrix, int max) {
        Assertions.assertThat(solution.maximalRectangle(matrix)).isEqualTo(max);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new char[][] {
                        { '1', '0', '1', '0', '0' },
                        { '1', '0', '1', '1', '1' },
                        { '1', '1', '1', '1', '1' },
                        { '1', '0', '0', '1', '0' } },
                        6
                ),
                Arguments.of(new char[][] {
                        { '0' } },
                        0
                ),
                Arguments.of(new char[][] {
                        { '1' } },
                        1
                )
        );
    }

}

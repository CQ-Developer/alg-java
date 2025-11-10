package org.huhu.leetcode.n1277;

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
    void test(int[][] matrix, int cnt) {
        Assertions.assertThat(solution.countSquares(matrix)).isEqualTo(cnt);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[][] { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 1, 1, 1 } }, 15),
                Arguments.of(new int[][] { { 1, 0, 1 }, { 1, 1, 0 }, { 1, 1, 0 } }, 7)
        );
    }

}

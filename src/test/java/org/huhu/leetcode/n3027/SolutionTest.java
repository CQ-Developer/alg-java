package org.huhu.leetcode.n3027;

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
    void test(int[][] points, int ans) {
        Assertions.assertThat(solution.numberOfPairs(points)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[][] { { 1, 1 }, { 2, 2 }, { 3, 3 } }, 0),
                Arguments.of(new int[][] { { 6, 2 }, { 4, 4 }, { 2, 6 } }, 2),
                Arguments.of(new int[][] { { 3, 1 }, { 1, 3 }, { 1, 1 } }, 2));
    }

}

package org.huhu.leetcode.n2242;

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
    void test(int[] scores, int[][] edges, int mx) {
        Assertions.assertThat(solution.maximumScore(scores, edges)).isEqualTo(mx);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(
                        new int[] { 5, 2, 9, 8, 4 },
                        new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 0, 2 }, { 1, 3 }, { 2, 4 } },
                        24
                ),
                Arguments.of(
                        new int[] { 9, 20, 6, 4, 11, 12 },
                        new int[][] { { 0, 3 }, { 5, 3 }, { 2, 4 }, { 1, 3 } },
                        -1
                )
        );
    }

}

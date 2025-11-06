package org.huhu.leetcode.n1504;

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
    void test(int[][] mat, int ans) {
        Assertions.assertThat(solution.numSubmat(mat)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
            Arguments.of(new int[][] {
                { 1, 0, 1 },
                { 1, 1, 0 },
                { 1, 1, 0 } },
                13
            ),
            Arguments.of(new int[][] {
                { 0, 1, 1, 0 },
                { 0, 1, 1, 1 },
                { 1, 1, 1, 0 } },
                24
            )
        );
    }

}

package org.huhu.leetcode.n3480;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

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
    @MethodSource("gen")
    void test(int n, int[][] conflictingPairs, long expected) {
        assertThat(solution.maxSubarrays(n, conflictingPairs)).isEqualTo(expected);
    }

    static Stream<Arguments> gen() {
        return Stream.of(
                arguments(4, new int[][] { { 2, 3 }, { 1, 4 } }, 9),
                arguments(12, new int[][] { { 1, 2 }, { 2, 5 }, { 3, 5 } }, 12));
    }

}

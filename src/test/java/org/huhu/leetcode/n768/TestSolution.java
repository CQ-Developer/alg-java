package org.huhu.leetcode.n768;

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
    @MethodSource("source")
    void test(int[] arr, int result) {
        assertThat(solution.maxChunksToSorted(arr)).isEqualTo(result);
    }

    static Stream<Arguments> source() {
        return Stream.of(
                arguments(new int[] { 5, 4, 3, 2, 1 }, 1),
                arguments(new int[] { 2, 1, 3, 4, 4 }, 4),
                arguments(new int[] { 4, 2, 2, 1, 1 }, 1),
                arguments(new int[] { 0, 0, 1, 1, 1 }, 5));
    }

}

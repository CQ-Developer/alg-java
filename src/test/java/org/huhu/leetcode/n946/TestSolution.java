package org.huhu.leetcode.n946;

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
    void test(int[] pushed, int[] popped, boolean result) {
        assertThat(solution.validateStackSequences(pushed, popped)).isEqualTo(result);
    }

    static Stream<Arguments> gen() {
        return Stream.of(
                arguments(new int[] { 1, 2, 3, 4, 5 }, new int[] { 4, 5, 3, 2, 1 }, true),
                arguments(new int[] { 1, 2, 3, 4, 5 }, new int[] { 4, 3, 5, 1, 2 }, false));
    }

}

package org.huhu.leetcode.n1010;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @ParameterizedTest
    @MethodSource("gen")
    void test(int[] time, int expected) {
        assertThat(solution.numPairsDivisibleBy60(time)).isEqualTo(expected);
    }

    static Stream<Arguments> gen() {
        return Stream.of(
                arguments(new int[]{30, 20, 150, 100, 40}, 3),
                arguments(new int[]{60, 60, 60}, 3));
    }

}

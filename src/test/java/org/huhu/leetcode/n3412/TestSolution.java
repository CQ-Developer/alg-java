package org.huhu.leetcode.n3412;

import static org.assertj.core.api.Assertions.assertThat;

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
    void test(String s, int result) {
        assertThat(solution.calculateScore(s)).isEqualTo(result);
    }

    static Stream<Arguments> gen() {
        return Stream.of(
                Arguments.arguments("aczzx", 5),
                Arguments.arguments("abcdef", 0));
    }

}

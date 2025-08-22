package org.huhu.leetcode.n844;

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
    void test(String s, String t, boolean result) {
        assertThat(solution.backspaceCompare(s, t)).isEqualTo(result);
    }

    static Stream<Arguments> gen() {
        return Stream.of(
                arguments("ab#c", "ad#c", true),
                arguments("ab##", "c#d#", true),
                arguments("a#c", "b", false));
    }

}

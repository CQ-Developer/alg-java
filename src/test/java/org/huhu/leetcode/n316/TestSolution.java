package org.huhu.leetcode.n316;

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
    void test(String s, String expected) {
        Assertions.assertThat(solution.removeDuplicateLetters(s)).isEqualTo(expected);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("bcabc", "abc"),
                Arguments.of("cbacdcbc", "acdb"),
                Arguments.of("bbcaac", "bac"),
                Arguments.of("abacb", "abc"));
    }

}

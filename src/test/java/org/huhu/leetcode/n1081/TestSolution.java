package org.huhu.leetcode.n1081;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

abstract class TestSolution {

    Solution solution;

    abstract Solution instance();

    @BeforeEach
    void setup() {
        solution = instance();
    }

    @ParameterizedTest
    @MethodSource("data")
    void test(String s, String ans) {
        Assertions.assertThat(solution.smallestSubsequence(s)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("bcabc", "abc"),
                Arguments.of("cbacdcbc", "acdb"));
    }

}

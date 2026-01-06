package org.huhu.leetcode.n1930;

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
    void test(String s, int cnt) {
        Assertions.assertThat(solution.countPalindromicSubsequence(s)).isEqualTo(cnt);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("aabca", 3),
                Arguments.of("adc", 0),
                Arguments.of("bbcbaba", 4));
    }

}

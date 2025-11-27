package org.huhu.leetcode.n402;

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
    @MethodSource("dataSet")
    void test(String nums, int k, String expected) {
        Assertions.assertThat(solution.removeKdigits(nums, k)).isEqualTo(expected);
    }

    static Stream<Arguments> dataSet() {
        return Stream.of(
                Arguments.of("1432219", 3, "1219"),
                Arguments.of("10200", 1, "200"),
                Arguments.of("10", 2, "0"));
    }

}

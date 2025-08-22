package org.huhu.leetcode.n682;

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
    @MethodSource("data")
    void test(String[] operations, int result) {
        assertThat(solution.calPoints(operations)).isEqualTo(result);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.arguments(new String[] { "5", "2", "C", "D", "+" }, 30),
                Arguments.arguments(new String[] { "5", "-2", "4", "C", "D", "9", "+", "+" }, 27),
                Arguments.arguments(new String[] { "1", "C" }, 0));
    }

}

package org.huhu.leetcode.n456;

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
    void test(int[] nums, boolean result) {
        assertThat(solution.find132pattern(nums)).isEqualTo(result);
    }

    static Stream<Arguments> source() {
        return Stream.of(
                arguments(new int[] { 1, 2, 3, 4 }, false),
                arguments(new int[] { 3, 1, 4, 2 }, true),
                arguments(new int[] { -1, 3, 2, 0 }, true));
    }

}

package org.huhu.leetcode.n2104;

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
    void test(int[] nums, long expected) {
        Assertions.assertThat(solution.subArrayRanges(nums)).isEqualTo(expected);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 1, 2, 3 }, 4),
                Arguments.of(new int[] { 1, 3, 3 }, 4),
                Arguments.of(new int[] { 4, -2, -3, 4, 1 }, 59));
    }

}

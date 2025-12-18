package org.huhu.leetcode.n2760;

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
    void test(int[] nums, int threshold, int longest) {
        Assertions.assertThat(solution.longestAlternatingSubarray(nums, threshold)).isEqualTo(longest);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 3, 2, 5, 4 }, 5, 3),
                Arguments.of(new int[] { 1, 2 }, 2, 1),
                Arguments.of(new int[] { 2, 3, 4, 5 }, 4, 3));
    }

}

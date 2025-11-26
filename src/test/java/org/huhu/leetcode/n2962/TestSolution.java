package org.huhu.leetcode.n2962;

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
    void test(int[] nums, int k, long expected) {
        Assertions.assertThat(solution.countSubarrays(nums, k)).isEqualTo(expected);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 1, 3, 2, 3, 3 }, 2, 6),
                Arguments.of(new int[] { 1, 4, 2, 1 }, 3, 0),
                Arguments.of(new int[] { 61, 23, 38, 23, 56, 40, 82, 56, 82, 82, 82, 70, 8, 69, 8, 7, 19, 14, 58, 42, 82, 10, 82, 78, 15, 82 }, 2, 224));
    }

}

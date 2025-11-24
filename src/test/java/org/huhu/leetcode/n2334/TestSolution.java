package org.huhu.leetcode.n2334;

import java.util.List;
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
    void test(int[] nums, int threshold, List<Integer> expected) {
        Assertions.assertThat(solution.validSubarraySize(nums, threshold)).isIn(expected);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 1, 3, 4, 3, 1 }, 6, List.of(3)),
                Arguments.of(new int[] { 6, 5, 6, 5, 8 }, 7, List.of(1, 2, 3, 4, 5)));
    }

}

package org.huhu.leetcode.n2289;

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
    @MethodSource("getData")
    void test(int[] nums, int result) {
        Assertions.assertThat(solution.totalSteps(nums)).isEqualTo(result);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[] { 5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11 }, 3),
                Arguments.of(new int[] { 4, 5, 7, 7, 13 }, 0));
    }

}

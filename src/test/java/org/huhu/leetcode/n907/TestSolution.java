package org.huhu.leetcode.n907;

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
    void test(int[] arr, int sum) {
        Assertions.assertThat(solution.sumSubarrayMins(arr)).isEqualTo(sum);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 3, 1, 2, 4 }, 17),
                Arguments.of(new int[] { 11, 81, 94, 43, 3 }, 444),
                Arguments.of(new int[] { 71, 55, 82, 55 }, 593));
    }

}

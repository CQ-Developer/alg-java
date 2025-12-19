package org.huhu.leetcode.n525;

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
    void test(int[] nums, int ans) {
        Assertions.assertThat(solution.findMaxLength(nums)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 0, 1 }, 2),
                Arguments.of(new int[] { 0, 1, 0 }, 2),
                Arguments.of(new int[] { 0, 1, 1, 1, 1, 1, 0, 0, 0 }, 6));
    }

}

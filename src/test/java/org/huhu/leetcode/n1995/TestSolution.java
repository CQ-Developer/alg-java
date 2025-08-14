package org.huhu.leetcode.n1995;

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
    @MethodSource("generated")
    void test(int[] nums, int expected) {
        assertThat(solution.countQuadruplets(nums)).isEqualTo(expected);
    }

    static Stream<Arguments> generated() {
        return Stream.of(
                arguments(new int[] { 1, 2, 3, 6 }, 1),
                arguments(new int[] { 3, 3, 6, 4, 5 }, 0),
                arguments(new int[] { 1, 1, 1, 3, 5 }, 4));
    }

}

package org.huhu.leetcode.n1031;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @ParameterizedTest
    @MethodSource("generated")
    void test(int[] nums, int firstLen, int secondLen, int expected) {
        assertThat(solution.maxSumTwoNoOverlap(nums, firstLen, secondLen)).isEqualTo(expected);
    }

    static Stream<Arguments> generated() {
        return Stream.of(
                arguments(new int[] { 0, 6, 5, 2, 2, 5, 1, 9, 4 }, 1, 2, 20),
                arguments(new int[] { 3, 8, 1, 3, 2, 1, 8, 9, 0 }, 3, 2, 29),
                arguments(new int[] { 2, 1, 5, 6, 0, 9, 5, 0, 3, 8 }, 4, 3, 31));
    }

}

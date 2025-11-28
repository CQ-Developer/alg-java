package org.huhu.leetcode.n1673;

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
    @MethodSource("methodSource")
    void test(int[] nums, int k, int[] expected) {
        Assertions.assertThat(solution.mostCompetitive(nums, k)).containsExactly(expected);
    }

    static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of(new int[] { 3, 5, 2, 6 }, 2, new int[] { 2, 6 }),
                Arguments.of(new int[] { 2, 4, 3, 3, 5, 4, 9, 6 }, 4, new int[] { 2, 3, 3, 4 }));
    }

}

package org.huhu.leetcode.n853;

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
    @MethodSource("source")
    void test(int target, int[] position, int[] speed, int result) {
        assertThat(solution.carFleet(target, position, speed)).isEqualTo(result);
    }

    static Stream<Arguments> source() {
        return Stream.of(
                arguments(12, new int[] { 10, 8, 0, 5, 3 }, new int[] { 2, 4, 1, 1, 3 }, 3),
                arguments(10, new int[] { 3 }, new int[] { 3 }, 1),
                arguments(100, new int[] { 0, 2, 4 }, new int[] { 4, 2, 1 }, 1));
    }

}

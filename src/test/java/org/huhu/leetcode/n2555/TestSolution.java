package org.huhu.leetcode.n2555;

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
    void test(int[] prizePositions, int k, int expected) {
        assertThat(solution.maximizeWin(prizePositions, k)).isEqualTo(expected);
    }

    static Stream<Arguments> generated() {
        return Stream.of(
                arguments(new int[] { 1, 1, 2, 2, 3, 3, 5 }, 2, 7),
                arguments(new int[] { 1, 2, 3, 4 }, 0, 2));
    }

}

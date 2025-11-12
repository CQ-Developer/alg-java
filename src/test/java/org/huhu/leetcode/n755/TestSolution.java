package org.huhu.leetcode.n755;

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
    void test(int[] heights, int volume, int k, int[] expected) {
        Assertions.assertThat(solution.pourWater(heights, volume, k)).containsExactly(expected);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 2, 1, 1, 2, 1, 2, 2 }, 4, 3, new int[] { 2, 2, 2, 3, 2, 2, 2 }),
                Arguments.of(new int[] { 1, 2, 3, 4 }, 2, 2, new int[] { 2, 3, 3, 4 }),
                Arguments.of(new int[] { 3, 1, 3 }, 5, 1, new int[] { 4, 4, 4 }));
    }

}

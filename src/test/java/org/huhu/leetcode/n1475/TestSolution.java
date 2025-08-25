package org.huhu.leetcode.n1475;

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
    void test(int[] prices, int[] result) {
        assertThat(solution.finalPrices(prices)).containsExactly(result);
    }

    static Stream<Arguments> source() {
        return Stream.of(
                arguments(new int[] { 8, 4, 6, 2, 3 }, new int[] { 4, 2, 4, 2, 3 }),
                arguments(new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 2, 3, 4, 5 }),
                arguments(new int[] { 10, 1, 1, 6 }, new int[] { 9, 0, 1, 6 }));
    }

}

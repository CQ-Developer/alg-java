package org.huhu.leetcode.tianchi2022.ev2bru.q3;

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
    void test(int[] order, int limit, int[] expected) {
        Assertions.assertThat(solution.arrangeBookshelf(order, limit)).containsExactly(expected);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 5, 5, 6, 5 }, 2, new int[] { 5, 5, 6 }),
                Arguments.of(new int[] { 5, 5, 6, 5 }, 3, new int[] { 5, 5, 6, 5 }),
                Arguments.of(new int[] { 3, 3, 9, 8, 9, 2, 8 }, 1, new int[] { 3, 8, 9, 2 }),
                Arguments.of(new int[] { 2, 1, 2, 2, 1, 3, 3, 1, 3, 3 }, 2, new int[] { 1, 2, 2, 1, 3, 3 }));
    }

}

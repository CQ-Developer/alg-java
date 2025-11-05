package org.huhu.leetcode.n42;

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
    void test(int[] height, int water) {
        Assertions.assertThat(solution.trap(height)).isEqualTo(water);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }, 6),
                Arguments.of(new int[] { 4, 2, 0, 3, 2, 5 }, 9));
    }

}

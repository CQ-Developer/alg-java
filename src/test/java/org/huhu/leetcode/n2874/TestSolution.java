package org.huhu.leetcode.n2874;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void test(int[] nums, long expected) {
        assertThat(solution.maximumTripleValue(nums)).isEqualTo(expected);
    }

    static Stream<Arguments> generateData() {
        return Stream.of(
                arguments(new int[]{12, 6, 1, 2, 7}, 77),
                arguments(new int[]{1, 10, 3, 4, 19}, 133),
                arguments(new int[]{1, 2, 3}, 0),
                arguments(new int[]{8, 6, 3, 13, 2, 12, 19, 5, 19, 6, 10, 11, 9}, 266));
    }

}
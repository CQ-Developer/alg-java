package org.huhu.leetcode.n3267;

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
    @MethodSource("generate")
    void test(int[] nums, int expected) {
        assertThat(solution.countPairs(nums)).isEqualTo(expected);
    }

    static Stream<Arguments> generate() {
        return Stream.of(
                arguments(new int[] { 1023, 2310, 2130, 213 }, 4),
                arguments(new int[] { 1, 10, 100 }, 3));
    }

}

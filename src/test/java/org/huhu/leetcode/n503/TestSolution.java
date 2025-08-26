package org.huhu.leetcode.n503;

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
    void test(int[] nums, int[] result) {
        assertThat(solution.nextGreaterElements(nums)).containsExactly(result);
    }

    static Stream<Arguments> source() {
        return Stream.of(
                arguments(new int[] { 1, 2, 1 }, new int[] { 2, -1, 2 }),
                arguments(new int[] { 1, 2, 3, 4, 3 }, new int[] { 2, 3, 4, -1, 4 }));
    }

}

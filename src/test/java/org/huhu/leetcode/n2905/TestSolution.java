package org.huhu.leetcode.n2905;

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
    @MethodSource("gen")
    void test(int[] nums, int indexDifference, int valueDifference, int[] expected) {
        assertThat(solution.findIndices(nums, indexDifference, valueDifference)).isEqualTo(expected);
    }

    public static Stream<Arguments> gen() {
        return Stream.of(
                arguments(new int[]{5, 1, 4, 1}, 2, 4, new int[]{0, 3}),
                arguments(new int[]{2, 1}, 0, 0, new int[]{0, 0}),
                arguments(new int[]{1, 2, 3}, 2, 4, new int[]{-1, -1}));
    }

}
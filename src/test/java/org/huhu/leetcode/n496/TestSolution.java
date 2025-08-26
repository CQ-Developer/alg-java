package org.huhu.leetcode.n496;

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
    void test(int[] nums1, int[] nums2, int[] result) {
        assertThat(solution.nextGreaterElement(nums1, nums2)).containsExactly(result);
    }

    static Stream<Arguments> source() {
        return Stream.of(
                arguments(new int[] { 4, 1, 2 }, new int[] { 1, 3, 4, 2 }, new int[] { -1, 3, -1 }),
                arguments(new int[] { 2, 4 }, new int[] { 1, 2, 3, 4 }, new int[] { 3, -1 }));
    }

}

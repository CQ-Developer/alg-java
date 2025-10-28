package org.huhu.leetcode.n3555;

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
    void test(int[] nums, int k, int[] ans) {
        Assertions.assertThat(solution.minSubarraySort(nums, k)).containsExactly(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 1, 3, 2, 4, 5 }, 3, new int[] { 2, 2, 0 }),
                Arguments.of(new int[] { 5, 4, 3, 2, 1 }, 4, new int[] { 4, 4 }));
    }

}

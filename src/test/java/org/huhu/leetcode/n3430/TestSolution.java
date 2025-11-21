package org.huhu.leetcode.n3430;

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
    void test(int[] nums, int k, long ans) {
        Assertions.assertThat(solution.minMaxSubarraySum(nums, k)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 1, 2, 3 }, 2, 20),
                Arguments.of(new int[] { 1, -3, 1 }, 2, -6));
    }

}

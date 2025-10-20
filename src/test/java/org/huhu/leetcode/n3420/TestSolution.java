package org.huhu.leetcode.n3420;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

abstract class TestSolution {

    Solution alg;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        alg = getSolution();
    }

    @ParameterizedTest
    @MethodSource("data()")
    void test(int[] nums, int k, long ans) {
        Assertions.assertThat(alg.countNonDecreasingSubarrays(nums, k)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 6, 3, 1, 2, 4, 4 }, 7, 17),
                Arguments.of(new int[] { 6, 3, 1, 3, 6 }, 4, 12)
        );
    }

}

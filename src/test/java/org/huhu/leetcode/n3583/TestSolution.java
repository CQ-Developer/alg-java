package org.huhu.leetcode.n3583;

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
    void test(int[] nums, int ans) {
        Assertions.assertThat(solution.specialTriplets(nums)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 6, 3, 6 }, 1),
                Arguments.of(new int[] { 0, 1, 0, 0 }, 1),
                Arguments.of(new int[] { 8, 4, 2, 8, 4 }, 2));
    }

}

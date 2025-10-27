package org.huhu.leetcode.n2832;

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
    void test(int[] nums, int[] ans) {
        Assertions.assertThat(solution.maximumLengthOfRanges(nums)).containsExactly(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
            Arguments.of(new int[] { 1, 5, 4, 3, 6 }, new int[] { 1, 4, 2, 1, 5 }),
            Arguments.of(new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 2, 3, 4, 5 })
        );
    }

}

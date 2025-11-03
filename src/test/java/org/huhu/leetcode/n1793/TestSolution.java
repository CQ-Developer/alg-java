package org.huhu.leetcode.n1793;

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
    void test(int[] nums, int k, int ans) {
        Assertions.assertThat(solution.maximumScore(nums, k)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 1, 4, 3, 7, 4, 5 }, 3, 15),
                Arguments.of(new int[] { 5, 5, 4, 5, 4, 1, 1, 1 }, 0, 20));
    }

}

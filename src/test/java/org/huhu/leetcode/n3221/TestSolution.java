package org.huhu.leetcode.n3221;

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
    void test(int[] nums, long ans) {
        Assertions.assertThat(solution.maxScore(nums)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 4, 5, 2, 8, 9, 1, 3 }, 42),
                Arguments.of(new int[] { 1, 5, 8 }, 16)
        );
    }

}

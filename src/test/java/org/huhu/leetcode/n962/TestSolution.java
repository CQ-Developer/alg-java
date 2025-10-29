package org.huhu.leetcode.n962;

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
        Assertions.assertThat(solution.maxWidthRamp(nums)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 6, 0, 8, 2, 1, 5 }, 4),
                Arguments.of(new int[] { 9, 8, 1, 0, 1, 9, 4, 0, 4, 1 }, 7));
    }

}

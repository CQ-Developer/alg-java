package org.huhu.leetcode.n2909;

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
        Assertions.assertThat(solution.minimumSum(nums)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 8, 6, 1, 5, 3 }, 9),
                Arguments.of(new int[] { 5, 4, 8, 7, 10, 2 }, 13),
                Arguments.of(new int[] { 6, 5, 4, 3, 4, 5 }, -1));
    }

}

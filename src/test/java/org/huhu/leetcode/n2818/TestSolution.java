package org.huhu.leetcode.n2818;

import java.util.List;
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
    void test(List<Integer> nums, int k, int expected) {
        Assertions.assertThat(solution.maximumScore(nums, k)).isEqualTo(expected);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(List.of(8, 3, 9, 3, 8), 2, 81),
                Arguments.of(List.of(19, 12, 14, 6, 10, 18), 3, 4788));
    }

}

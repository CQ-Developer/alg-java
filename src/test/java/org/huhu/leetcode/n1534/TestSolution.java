package org.huhu.leetcode.n1534;

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
    void test(int[] arr, int a, int b, int c, int cnt) {
        Assertions.assertThat(solution.countGoodTriplets(arr, a, b, c)).isEqualTo(cnt);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 3, 0, 1, 1, 9, 7 },            7, 2, 3, 4),
                Arguments.of(new int[] { 1, 1, 2, 2, 3 },               0, 0, 1, 0),
                Arguments.of(new int[] { 7, 3, 7, 3, 12, 1, 12, 2, 3 }, 5, 8, 1, 12));
    }

}

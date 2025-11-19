package org.huhu.leetcode.n50;

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
    void test(double x, int n, double p) {
        Assertions.assertThat(solution.myPow(x, n)).isEqualTo(p, Assertions.within(0.00001));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(2.0, 10, 1024.0),
                Arguments.of(2.1, 3, 9.261),
                Arguments.of(2.0, -2, 0.25));
    }
}

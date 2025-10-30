package org.huhu.leetcode.n3542;

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

    @ParameterizedTest(name = "3542. minimum operations to convert all elements to zero")
    @MethodSource("data")
    void test(int[] nums, int ans) {
        Assertions.assertThat(solution.minOperations(nums)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 0, 2 }, 1),
                Arguments.of(new int[] { 3, 1, 2, 1 }, 3),
                Arguments.of(new int[] { 1, 2, 1, 2, 1, 2 }, 4));
    }

}

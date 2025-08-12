package org.huhu.leetcode.n2748;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @ParameterizedTest
    @MethodSource("gen")
    void test(int[] nums, int expected) {
        assertThat(solution.countBeautifulPairs(nums)).isEqualTo(expected);
    }

    static Stream<Arguments> gen() {
        return Stream.of(
                Arguments.arguments(new int[]{2, 5, 1, 4}, 5),
                Arguments.arguments(new int[]{11, 21, 12}, 2));
    }

}
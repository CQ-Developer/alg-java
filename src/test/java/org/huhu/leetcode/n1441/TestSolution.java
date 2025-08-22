package org.huhu.leetcode.n1441;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.stream.Stream;

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
    @MethodSource("gen")
    void test(int[] target, int n, List<String> expected) {
        assertThat(solution.buildArray(target, n)).containsExactlyElementsOf(expected);
    }

    static Stream<Arguments> gen() {
        return Stream.of(
                arguments(new int[] { 1, 3 }, 3, List.of("Push", "Push", "Pop", "Push")),
                arguments(new int[] { 1, 2, 3 }, 3, List.of("Push", "Push", "Push")),
                arguments(new int[] { 1, 2 }, 4, List.of("Push", "Push")));
    }

}

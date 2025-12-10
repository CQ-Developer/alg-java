package org.huhu.leetcode.n2030;

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
    void test(String s, int k, char letter, int repetition, String ans) {
        Assertions.assertThat(solution.smallestSubsequence(s, k, letter, repetition)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("leet", 3, 'e', 1, "eet"),
                Arguments.of("leetcode", 4, 'e', 2, "ecde"),
                Arguments.of("bb", 2, 'b', 2, "bb"),
                Arguments.of("bba", 1, 'b', 1, "b"));
    }

}

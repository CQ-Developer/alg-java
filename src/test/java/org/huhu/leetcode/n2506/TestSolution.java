package org.huhu.leetcode.n2506;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @ParameterizedTest
    @MethodSource("gen")
    void test1(String[] words, int expected) {
        assertThat(solution.similarPairs(words)).isEqualTo(expected);
    }

    static Stream<Arguments> gen() {
        return Stream.of(
                arguments(new String[]{"aba", "aabb", "abcd", "bac", "aabc"}, 2),
                arguments(new String[]{"aabb", "ab", "ba"}, 3),
                arguments(new String[]{"nba", "cba", "dba"}, 0));
    }

}
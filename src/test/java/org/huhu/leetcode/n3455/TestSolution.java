package org.huhu.leetcode.n3455;

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
    void test(String s, String p, int len) {
        Assertions.assertThat(solution.shortestMatchingSubstring(s, p)).isEqualTo(len);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("abaacbaecebce", "ba*c*ce", 8),
                Arguments.of("baccbaadbc", "cc*baa*adb", -1),
                Arguments.of("a", "**", 0),
                Arguments.of("madlogic", "*adlogi*", 6));
    }

}

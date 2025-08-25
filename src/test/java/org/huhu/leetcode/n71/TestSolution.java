package org.huhu.leetcode.n71;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

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
    @MethodSource("source")
    void test(String path, String result) {
        assertThat(solution.simplifyPath(path)).isEqualTo(result);
    }

    static Stream<Arguments> source() {
        return Stream.of(
                arguments("/home/", "/home"),
                arguments("/home//foo/", "/home/foo"),
                arguments("/home/user/Documents/../Pictures", "/home/user/Pictures"),
                arguments("/../", "/"),
                arguments("/.../a/../b/c/../d/./", "/.../b/d"));
    }

}

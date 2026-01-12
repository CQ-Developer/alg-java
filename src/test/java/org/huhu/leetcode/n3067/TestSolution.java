package org.huhu.leetcode.n3067;

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
    void test(int[][] edges, int signalSpeed, int[] ans) {
        Assertions.assertThat(ans).containsExactly(solution.countPairsOfConnectableServers(edges, signalSpeed));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[][] { { 0, 1, 1 }, { 1, 2, 5 }, { 2, 3, 13 }, { 3, 4, 9 }, { 4, 5, 2 } }, 1,
                        new int[] { 0, 4, 6, 6, 4, 0 }),
                Arguments.of(
                        new int[][] { { 0, 6, 3 }, { 6, 5, 3 }, { 0, 3, 1 }, { 3, 2, 7 }, { 3, 1, 6 }, { 3, 4, 2 } }, 3,
                        new int[] { 2, 0, 0, 0, 0, 0, 2 }));
    }

}

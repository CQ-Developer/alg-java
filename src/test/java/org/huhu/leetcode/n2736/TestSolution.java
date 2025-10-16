package org.huhu.leetcode.n2736;

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
    @MethodSource("getData")
    void testA(int[] nums1, int[] nums2, int[][] queries, int[] result) {
        Assertions.assertThat(solution.maximumSumQueries(nums1, nums2, queries)).containsExactly(result);
    }

    static Stream<Arguments> getData() {
        // @formatter:off
        return Stream.of(
                Arguments.of(
                        new int[] { 4, 3, 1, 2 },
                        new int[] { 2, 4, 9, 5 },
                        new int[][] { { 4, 1 }, { 1, 3 }, { 2, 5 } },
                        new int[] { 6, 10, 7 }
                ),
                Arguments.of(
                        new int[] { 3, 2, 5 },
                        new int[] { 2, 3, 4 },
                        new int[][] { { 4, 4 }, { 3, 2 }, { 1, 1 } },
                        new int[] { 9, 9, 9 }
                ),
                Arguments.of(
                        new int[] { 2, 1 },
                        new int[] { 2, 3 },
                        new int[][] { { 3, 3 } },
                        new int[] { -1 }
                )
        );
        // @formatter:on
    }

}

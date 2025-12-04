package org.huhu.leetcode.n321;

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
    void test(int[] nums1, int[] nums2, int k, int[] ans) {
        Assertions.assertThat(solution.maxNumber(nums1, nums2, k)).containsExactly(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 3, 4, 6, 5 }, new int[] { 9, 1, 2, 5, 8, 3 }, 5, new int[] { 9, 8, 6, 5, 3 }),
                Arguments.of(new int[] { 6, 7 }, new int[] { 6, 0, 4 }, 5, new int[] { 6, 7, 6, 0, 4 }),
                Arguments.of(new int[] { 3, 9 }, new int[] { 8, 9 }, 3, new int[] { 9, 8, 9 }));
    }

}

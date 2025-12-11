package org.huhu.leetcode.n454;

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
    void test(int[] nums1, int[] nums2, int[] nums3, int[] nums4, int ans) {
        Assertions.assertThat(solution.fourSumCount(nums1, nums2, nums3, nums4)).isEqualTo(ans);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[] { 1, 2 }, new int[] { -2, -1 }, new int[] { -1, 2 }, new int[] { 0, 2 }, 2),
                Arguments.of(new int[] { 0 }, new int[] { 0 }, new int[] { 0 }, new int[] { 0 }, 1));
    }

}

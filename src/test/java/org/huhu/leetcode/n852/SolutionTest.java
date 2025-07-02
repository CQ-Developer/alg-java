package org.huhu.leetcode.n852;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution instance();

    @BeforeEach
    void setup() {
        solution = instance();
    }

    @Test
    void test1() {
        int[] arr = { 0, 1, 0 };
        assertThat(solution.peakIndexInMountainArray(arr)).isEqualTo(1);
    }

    @Test
    void test2() {
        int[] arr = { 0, 2, 1, 0 };
        assertThat(solution.peakIndexInMountainArray(arr)).isEqualTo(1);
    }

    @Test
    void test3() {
        int[] arr = { 0, 10, 5, 2 };
        assertThat(solution.peakIndexInMountainArray(arr)).isEqualTo(1);
    }

}

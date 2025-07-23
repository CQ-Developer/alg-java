package org.huhu.leetcode.n4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test1() {
        int[] nums1 = {1, 3}, nums2 = {2};
        assertThat(solution.findMedianSortedArrays(nums1, nums2)).isEqualTo(2.0);
    }

    @Test
    void test2() {
        int[] nums1 = {1, 2}, nums2 = {3, 4};
        assertThat(solution.findMedianSortedArrays(nums1, nums2)).isEqualTo(2.5);
    }

}

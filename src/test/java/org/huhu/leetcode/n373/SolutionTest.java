package org.huhu.leetcode.n373;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_1() {
        int[] nums1 = { 1, 7, 11 }, nums2 = { 2, 4, 6 };
        List<List<Integer>> res = List.of(List.of(1, 2), List.of(1, 4), List.of(1, 6));
        assertIterableEquals(res, solution.kSmallestPairs(nums1, nums2, 3));
    }

    @Test
    void test_2() {
        int[] nums1 = { 1, 1, 2 }, nums2 = { 1, 2, 3 };
        List<List<Integer>> res = List.of(List.of(1, 1), List.of(1, 1));
        assertIterableEquals(res, solution.kSmallestPairs(nums1, nums2, 2));
    }

}

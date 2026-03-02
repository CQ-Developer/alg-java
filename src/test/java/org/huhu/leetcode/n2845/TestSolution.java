package org.huhu.leetcode.n2845;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        List<Integer> nums = List.of(3, 2, 4);
        Assertions.assertThat(solution.countInterestingSubarrays(nums, 2, 1)).isEqualTo(3);
    }

    @Test
    void test_b() {
        List<Integer> nums = List.of(3, 1, 9, 6);
        Assertions.assertThat(solution.countInterestingSubarrays(nums, 3, 0)).isEqualTo(2);
    }

}

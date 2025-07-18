package org.huhu.leetcode.n540;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class TestSolution {

    Solution solution;

    abstract Solution geSolution();

    @BeforeEach
    void setup() {
        solution = geSolution();
    }

    @Test
    void test1() {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        assertThat(solution.singleNonDuplicate(nums)).isEqualTo(2);
    }

    @Test
    void test2() {
        int[] nums = { 3, 3, 7, 7, 10, 11, 11 };
        assertThat(solution.singleNonDuplicate(nums)).isEqualTo(10);
    }

}

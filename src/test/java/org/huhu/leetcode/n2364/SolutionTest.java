package org.huhu.leetcode.n2364;

import static org.assertj.core.api.Assertions.assertThat;

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
    void test1() {
        int[] nums = { 4, 1, 3, 3 };
        assertThat(solution.countBadPairs(nums)).isEqualTo(5);
    }

    @Test
    void test2() {
        int[] nums = { 1, 2, 3, 4, 5 };
        assertThat(solution.countBadPairs(nums)).isEqualTo(0);
    }

}

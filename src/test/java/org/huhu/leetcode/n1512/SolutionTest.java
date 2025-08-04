package org.huhu.leetcode.n1512;

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
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        assertThat(solution.numIdenticalPairs(nums)).isEqualTo(4);
    }

    @Test
    void test2() {
        int[] nums = { 1, 1, 1, 1 };
        assertThat(solution.numIdenticalPairs(nums)).isEqualTo(6);
    }

    @Test
    void test3() {
        int[] nums = { 1, 2, 3 };
        assertThat(solution.numIdenticalPairs(nums)).isEqualTo(0);
    }

}

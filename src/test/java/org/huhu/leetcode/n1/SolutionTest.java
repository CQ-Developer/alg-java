package org.huhu.leetcode.n1;

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
        assertThat(solution.twoSum(new int[] { 2, 7, 11, 15 }, 9)).containsExactly(0, 1);
    }

    @Test
    void test2() {
        assertThat(solution.twoSum(new int[] { 3, 2, 4 }, 6)).containsExactly(1, 2);
    }

    @Test
    void test3() {
        assertThat(solution.twoSum(new int[] { 3, 3 }, 6)).containsExactly(0, 1);
    }

}

package org.huhu.leetcode.n2454;

import static org.assertj.core.api.Assertions.assertThat;

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
    void testA() {
        int[] nums = { 2, 4, 0, 9, 6 };
        assertThat(solution.secondGreaterElement(nums)).containsExactly(9, 6, 6, -1, -1);
    }

    @Test
    void testB() {
        int[] nums = { 3, 3 };
        assertThat(solution.secondGreaterElement(nums)).containsExactly(-1, -1);
    }

}

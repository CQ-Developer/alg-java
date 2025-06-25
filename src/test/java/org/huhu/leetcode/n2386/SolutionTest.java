package org.huhu.leetcode.n2386;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        this.solution = getSolution();
    }

    @Test
    void test1() {
        assertEquals(2, this.solution.kSum(new int[] { 2, 4, -2 }, 5));
    }

    @Test
    void test2() {
        assertEquals(10, this.solution.kSum(new int[] { 1, -2, 3, 4, -10, 12 }, 16));
    }

}

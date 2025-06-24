package org.huhu.leetcode.n3134;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution geSolution();

    @BeforeEach
    void setup() {
        solution = geSolution();
    }

    @Test
    void test1() {
        assertEquals(1, this.solution.medianOfUniquenessArray(new int[] { 1, 2, 3 }));
    }

    @Test
    void test2() {
        assertEquals(2, this.solution.medianOfUniquenessArray(new int[] { 3, 4, 3, 4, 5 }));
    }

    @Test
    void test3() {
        assertEquals(2, this.solution.medianOfUniquenessArray(new int[] { 4, 3, 5, 4 }));
    }

}

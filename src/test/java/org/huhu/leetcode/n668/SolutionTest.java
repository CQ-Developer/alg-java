package org.huhu.leetcode.n668;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(3, solution.findKthNumber(3, 3, 5));
    }

    @Test
    void test_2() {
        assertEquals(6, solution.findKthNumber(2, 3, 6));
    }

}

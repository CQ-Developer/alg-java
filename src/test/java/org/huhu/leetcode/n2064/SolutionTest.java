package org.huhu.leetcode.n2064;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void test_1() {
        int[] quantities = { 11, 6 };
        assertEquals(3, solution.minimizedMaximum(6, quantities));
    }

    @Test
    void test_2() {
        int[] quantities = { 15, 10, 10 };
        assertEquals(5, solution.minimizedMaximum(7, quantities));
    }

    @Test
    void test_3() {
        int[] quantities = { 100000 };
        assertEquals(100000, solution.minimizedMaximum(1, quantities));
    }

    @Test
    void test_4() {
        int[] quantities = { 5, 7 };
        assertEquals(7, solution.minimizedMaximum(2, quantities));
    }

    @Test
    void test_5() {
        int[] quantities = { 2, 10, 6 };
        assertEquals(10, solution.minimizedMaximum(3, quantities));
    }

}

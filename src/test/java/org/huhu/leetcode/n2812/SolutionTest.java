package org.huhu.leetcode.n2812;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

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
        var grid = List.of(List.of(1, 0, 0), List.of(0, 0, 0), List.of(0, 0, 1));
        assertEquals(0, solution.maximumSafenessFactor(grid));
    }

    @Test
    void test_2() {
        var grid = List.of(List.of(0, 0, 1), List.of(0, 0, 0), List.of(0, 0, 0));
        assertEquals(2, solution.maximumSafenessFactor(grid));
    }

    @Test
    void test_3() {
        var grid = List.of(List.of(0, 0, 0, 1), List.of(0, 0, 0, 0), List.of(0, 0, 0, 0), List.of(1, 0, 0, 0));
        assertEquals(2, solution.maximumSafenessFactor(grid));
    }

    @Test
    void test_4() {
        var grid = List.of(List.of(1, 1, 1), List.of(0, 1, 1), List.of(0, 0, 0));
        assertEquals(0, solution.maximumSafenessFactor(grid));
    }

    @Test
    void test_5() {
        var grid = List.of(List.of(0, 1, 1), List.of(0, 0, 0), List.of(0, 0, 0));
        assertEquals(1, solution.maximumSafenessFactor(grid));
    }

}

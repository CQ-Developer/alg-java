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

    @Test
    void test3() {
        int[] nums = { -487322177, -656480132, 850198596, -291605661, -272668395, 110865952, -162529283, -145886963, 202657909, 125667049, -282090943, 120877054, -85849348, -482630078, -802177895, -574862206, 374637017, 804297842 };
        assertEquals(1493582115L, this.solution.kSum(nums, 1707));
    }

}

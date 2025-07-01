package org.huhu.leetcode.n278;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.intThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution generate();

    @BeforeEach
    void setup() {
        solution = spy(generate());
    }

    @Test
    void test1() {
        doReturn(true).when(solution).isBadVersion(intThat(v -> v >= 4));
        assertEquals(4, solution.firstBadVersion(5));
    }

    @Test
    void test2() {
        doReturn(true).when(solution).isBadVersion(intThat(v -> v >= 1));
        assertEquals(1, solution.firstBadVersion(1));
    }

}

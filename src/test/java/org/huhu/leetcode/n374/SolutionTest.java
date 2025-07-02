package org.huhu.leetcode.n374;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.intThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution instance();

    @BeforeEach
    void setup() {
        solution = spy(instance());
    }

    @Test
    void test1() {
        doReturn(-1).when(solution).guess(intThat(x -> x > 6));
        doReturn(1).when(solution).guess(intThat(x -> x < 6));
        assertEquals(6, solution.guessNumber(10));
    }

    @Test
    void test2() {
        doReturn(-1).when(solution).guess(intThat(x -> x > 1));
        doReturn(1).when(solution).guess(intThat(x -> x < 1));
        assertEquals(1, solution.guessNumber(1));
    }

    @Test
    void test3() {
        doReturn(-1).when(solution).guess(intThat(x -> x > 1));
        doReturn(1).when(solution).guess(intThat(x -> x < 1));
        assertEquals(1, solution.guessNumber(2));
    }

}

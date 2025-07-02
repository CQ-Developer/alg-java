package org.huhu.leetcode.n1095;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution instance();

    @BeforeEach
    void setup() {
        solution = instance();
    }

    @Test
    void test1() {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        var mountainArr = mock(MountainArray.class);
        when(mountainArr.length()).thenReturn(arr.length);
        when(mountainArr.get(anyInt())).thenAnswer(invocation -> arr[invocation.getArgument(0, Integer.class)]);
        assertThat(solution.findInMountainArray(3, mountainArr)).isEqualTo(2);
    }

    @Test
    void test2() {
        int[] arr = { 0, 1, 2, 4, 2, 1 };
        var mountainArr = mock(MountainArray.class);
        when(mountainArr.length()).thenReturn(arr.length);
        when(mountainArr.get(anyInt())).thenAnswer(invocation -> arr[invocation.getArgument(0, Integer.class)]);
        assertThat(solution.findInMountainArray(3, mountainArr)).isEqualTo(-1);
    }

}

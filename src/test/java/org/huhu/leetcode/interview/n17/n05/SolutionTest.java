package org.huhu.leetcode.interview.n17.n05;

import org.assertj.core.api.Assertions;
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
    void testA() {
        String[] array = { "A", "1", "B", "C", "D", "2", "3", "4", "E", "5", "F", "G", "6", "7", "H", "I", "J", "K", "L", "M" };
        Assertions.assertThat(solution.findLongestSubarray(array)).containsExactly("A", "1", "B", "C", "D", "2", "3", "4", "E", "5", "F", "G", "6", "7");
    }

    @Test
    void testB() {
        String[] array = { "A", "A" };
        Assertions.assertThat(solution.findLongestSubarray(array)).isEmpty();
    }

}

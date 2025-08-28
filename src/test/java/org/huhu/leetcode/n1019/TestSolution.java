package org.huhu.leetcode.n1019;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @ParameterizedTest
    @MethodSource("source")
    void test(ListNode head, int[] result) {
        assertThat(solution.nextLargerNodes(head)).containsExactly(result);
    }

    static Stream<Arguments> source() {
        return Stream.of(
                arguments(
                        new ListNode(2, new ListNode(1, new ListNode(5))),
                        new int[] { 5, 5, 0 }),
                arguments(
                        new ListNode(2, new ListNode(7, new ListNode(4, new ListNode(3, new ListNode(5))))),
                        new int[] { 7, 0, 5, 5, 0 }));
    }

}

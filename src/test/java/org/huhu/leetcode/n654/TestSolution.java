package org.huhu.leetcode.n654;

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
    void test(int[] nums, TreeNode result) {
        assertThat(solution.constructMaximumBinaryTree(nums)).isEqualTo(result);
    }

    static Stream<Arguments> source() {
        return Stream.of(
                arguments(
                        new int[] { 3, 2, 1, 6, 0, 5 },
                        new TreeNode(6,
                                new TreeNode(3,
                                        null,
                                        new TreeNode(2,
                                                null,
                                                new TreeNode(1))),
                                new TreeNode(5,
                                        new TreeNode(0),
                                        null))),
                arguments(
                        new int[] { 3, 2, 1 },
                        new TreeNode(3,
                                null,
                                new TreeNode(2,
                                        null,
                                        new TreeNode(1)))));
    }

}

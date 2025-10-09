package org.huhu.leetcode.n654;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class TestSolution {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_1() {
        int[] nums = { 3, 2, 1, 6, 0, 5 };
        var expected = new TreeNode(6,
                new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1))),
                new TreeNode(5, new TreeNode(0), null));
        assertThat(solution.constructMaximumBinaryTree(nums)).isEqualTo(expected);
    }

    @Test
    void test_2() {
        int[] nums = { 3, 2, 1 };
        var expected = new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1)));
        assertThat(solution.constructMaximumBinaryTree(nums)).isEqualTo(expected);
    }

}

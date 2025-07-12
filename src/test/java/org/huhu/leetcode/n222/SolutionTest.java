package org.huhu.leetcode.n222;

import static org.assertj.core.api.Assertions.assertThat;

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
    void test1() {
        var root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null));
        assertThat(solution.countNodes(root)).isEqualTo(6);
    }

    @Test
    void test2() {
        assertThat(solution.countNodes(null)).isEqualTo(0);
    }

    @Test
    void test3() {
        var root = new TreeNode(1);
        assertThat(solution.countNodes(root)).isEqualTo(1);
    }

}

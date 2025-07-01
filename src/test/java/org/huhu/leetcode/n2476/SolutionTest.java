package org.huhu.leetcode.n2476;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution generate();

    @BeforeEach
    void setup() {
        solution = generate();
    }

    @Test
    void test1() {
        var root = new TreeNode(6, new TreeNode(2, new TreeNode(1), new TreeNode(4)), new TreeNode(13, new TreeNode(9), new TreeNode(15, new TreeNode(14), null)));
        assertIterableEquals(List.of(List.of(2, 2), List.of(4, 6), List.of(15, -1)), solution.closestNodes(root, List.of(2, 5, 16)));
    }

    @Test
    void test2() {
        var root = new TreeNode(4, null, new TreeNode(9));
        assertIterableEquals(List.of(List.of(-1, 4)), solution.closestNodes(root, List.of(3)));
    }

}

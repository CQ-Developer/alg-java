package org.huhu.leetcode.n654;

class SolutionA implements Solution {

    @Override
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int l, int r) {
        if (l == r) {
            return new TreeNode(nums[l]);
        }
        if (l > r) {
            return null;
        }
        int i = l;
        for (int j = l; j <= r; j++) {
            if (nums[i] < nums[j]) {
                i = j;
            }
        }
        return new TreeNode(nums[i], build(nums, l, i - 1), build(nums, i + 1, r));
    }

}

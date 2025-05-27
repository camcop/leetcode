package com.leetcode;

public class MaximumDepthOfBinaryTree104 {
    public int maxDepth(TreeNode root) {
        return inOrder(root, 0);
    }

    public int inOrder(TreeNode node, int depth) {
        if (node == null) return depth;
        depth++;
        return Math.max(inOrder(node.left, depth), inOrder(node.right, depth));
    }

}

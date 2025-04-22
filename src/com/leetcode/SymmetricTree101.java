package com.leetcode;

public class SymmetricTree101 {

    public boolean isSymmetric(TreeNode root) {
        return areEquivalent(root.left, root.right);
    }

    public boolean areEquivalent(TreeNode tree1, TreeNode tree2) {
        if ((tree1 == null) && (tree2 == null)) return true;

        if (tree1 == null || tree2 == null || tree1.val != tree2.val) return false;

        return areEquivalent(tree1.left, tree2.right) && areEquivalent(tree1.right, tree2.left);

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Runner101 {

    public static void main(String[] args) {

        SymmetricTree101 sol = new SymmetricTree101();
        sol.isSymmetric()


    }

}


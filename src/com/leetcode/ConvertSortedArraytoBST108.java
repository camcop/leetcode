package com.leetcode;


class TreeNode108 {
    int val;
    TreeNode108 left;
    TreeNode108 right;

    TreeNode108() {
    }

    TreeNode108(int val) {
        this.val = val;
    }

    TreeNode108(int val, TreeNode108 left, TreeNode108 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class ConvertSortedArraytoBST108 {

    TreeNode108 sortedArrayToBST(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        return constructNode(nums, left, right);
    }


    private TreeNode108 constructNode(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode108 node = new TreeNode108(nums[mid]);

        node.left = constructNode(nums, left, mid - 1);
        node.right = constructNode(nums, mid + 1, right);
        return node;
    }
}

class Runner108 {

    public static void main(String[] args) {

        int[] nums = {-10, -3, 0, 5, 9};
        ConvertSortedArraytoBST108 sol = new ConvertSortedArraytoBST108();
        TreeNode108 root = sol.sortedArrayToBST(nums);
        System.out.println(root.val);
    }
}

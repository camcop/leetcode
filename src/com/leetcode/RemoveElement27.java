package com.leetcode;

public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (k != i) {
                    nums[k] = nums[i];
                }
                k++;
            }
        }

        return k;
    }
}

class Runner27 {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;

        RemoveElement27 sol = new RemoveElement27();
        System.out.println(sol.removeElement(nums, val));
    }

}
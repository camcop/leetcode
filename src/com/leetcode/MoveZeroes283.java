package com.leetcode;

import java.util.Arrays;

public class MoveZeroes283 {

    public void moveZeroes(int[] nums) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
            if (j == nums.length - 1) {
                while (i < nums.length) {
                    nums[i++] = 0;
                }
            }
        }
    }


}

class Runner283 {

    public static void main(String[] args) {

        MoveZeroes283 sol = new MoveZeroes283();
        int[] nums = {0,1,0,3,12};
        sol.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }


}

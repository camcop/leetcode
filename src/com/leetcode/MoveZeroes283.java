package com.leetcode;

import java.util.Arrays;

public class MoveZeroes283 {

    public void moveZeroes(int[] nums) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                if (j > i) nums[j] = 0;
                i++;
            }
        }
    }


}

class Runner283 {

    public static void main(String[] args) {

        MoveZeroes283 sol = new MoveZeroes283();
//        int[] nums = {0,1,0,3,12};
        int[] nums = {0, 1};
        sol.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }


}

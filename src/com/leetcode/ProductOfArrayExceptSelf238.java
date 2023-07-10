package com.leetcode;

public class ProductOfArrayExceptSelf238 {

    public static int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            answer[i] = product / nums[i];
        }

        return answer;

    }


}

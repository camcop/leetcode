package com.leetcode;

class Solution {
    public long maximumTripletValue(int[] nums) {

        long max = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    long value = Long.valueOf(nums[i] - nums[j]) * nums[k];
                    if (value > max)
                        max = value;
                }
            }
        }

        return max;

    }
}

class Runner {

    public static void main(String[] args) {
        int[] nums = {1000000,1,1000000};

        Solution sol = new Solution();
        System.out.println(sol.maximumTripletValue(nums));
    }

}
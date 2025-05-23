package com.leetcode;

public class RangeSumQueryImmutable303 {

    int[] nums;

    public RangeSumQueryImmutable303(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }

}

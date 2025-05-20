package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber268 {

    public int missingNumber(int[] nums) {

        Set<Integer> space = new HashSet<>();

        for (int i = 0; i < nums.length + 1; i++) {
            space.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            space.remove(nums[i]);
        }

        return space.toArray(new Integer[1])[0];
    }

}

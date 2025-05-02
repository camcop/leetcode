package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            int pre = map.getOrDefault(nums[i], 0);
            map.put(nums[i], pre + 1);
            if (map.get(nums[i]) > map.getOrDefault(max, 0)) {
                max = nums[i];
            }
        }
        return max;
    }


}


class Runner169 {

    public static void main(String[] args) {

        MajorityElement169 sol = new MajorityElement169();
        int[] nums = {1};
        System.out.println(sol.majorityElement(nums));

    }

}


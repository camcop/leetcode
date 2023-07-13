package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIIInputArrayIsSorted167 {

    public static int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        int[] out = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                out[0] = map.get(numbers[i]) + 1;
                out[1] = i + 1;
            } else {
                map.put(target - numbers[i], i);
            }
        }

        return out;
    }

}

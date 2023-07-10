package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements347 {

    public static int[] topKFrequent(int[] nums, int k) {

        int[] out = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

//        Need to know what the hurdle is
//        i.e. what is the minimum count required to be in the top k counts
//        To do that we need to track the number of nums with counts above x
//        If number of nums above x is > k, increment x

        int min_count = 1;
        int nums_above_min = 0;

        for (int n: nums) {
            int count = map.getOrDefault(n, 0);
            map.put(n, count + 1);
            if (count == min_count) {
                if (nums_above_min++ > k)
                    min_count++;
            }
        }

        int i = 0;
        for (var entry : map.entrySet()) {
            if (entry.getValue() >= min_count)
                out[i++] = entry.getKey();
        }

        return out;
    }

}

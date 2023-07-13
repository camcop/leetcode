package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIIInputArrayIsSorted167 {

    public static int[] twoSum(int[] numbers, int target) {
// O(n)
        int i = 0;
        int j = numbers.length - 1;
        while (numbers[i] + numbers[j] != target) {
            if (numbers[i] + numbers[j] > target)
                j--;
            if (numbers[i] + numbers[j] < target)
                i++;
        }

        return new int[] {i + 1, j + 1};
    }
}

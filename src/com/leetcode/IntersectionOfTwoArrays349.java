package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>(Arrays.stream(nums1).boxed().toList());
        Set<Integer> set2 = new HashSet<Integer>(Arrays.stream(nums2).boxed().toList());
        Set<Integer> set3 = new HashSet<Integer>();
        for (int n : set1) {
            if (set2.contains(n)) set3.add(n);
        }

        return set3.stream().mapToInt(Integer::intValue).toArray();
    }


}

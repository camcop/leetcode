package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays349 {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> intersection = new HashSet<>();
        Set<Integer> set1 = new HashSet<Integer>(Arrays.stream(nums1).boxed().toList());
        Set<Integer> set2 = new HashSet<Integer>(Arrays.stream(nums2).boxed().toList());

        for (int n : set1) {
            if (set2.contains(n))
                intersection.add(n);
        }

        int[] out = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            out[i] = (int) intersection.toArray()[i];
        }

        return out;
    }


}
